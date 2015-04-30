package com.gtc.core.util;

import com.jcraft.jsch.*;
import org.apache.poi.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SFtpUtil {

    private static final Logger logger = LoggerFactory.getLogger(SFtpUtil.class);
    private static final Pattern FILE_PATH_PATTERN = Pattern.compile("(.*)/.*\\..*");
    private String host;
    private int port;
    private String userName;
    private String password;

    public SFtpUtil(String host, int port, String userName, String password) {
        this.setHost(host);
        this.setPort(port);
        this.setUserName(userName);
        this.setPassword(password);
    }

    public void saveFile(InputStream inputStream, String filePath) throws JSchException, SftpException, IOException {
        ChannelSftp channel = this.getChannelSftp();
        this.buildFolder(channel, filePath);
        OutputStream outputStream = channel.put(filePath);
        outputStream.write(IOUtils.toByteArray(inputStream));
        IOUtils.closeQuietly(outputStream);
        channel.disconnect();
        channel.getSession().disconnect();
    }

    private void buildFolder(ChannelSftp channel, String filePath) throws SftpException {
        Matcher matcher = FILE_PATH_PATTERN.matcher(filePath);
        String folderPath = null;
        if (matcher.find()) {
            folderPath = matcher.group(1);
            String[] folders = folderPath.split("/");
            for (String folder : folders) {
                if (folder.length() > 0) {
                    try {
                        channel.cd(folder);
                    } catch (SftpException e) {
                        channel.mkdir(folder);
                        channel.cd(folder);
                    }
                }
            }
        }
    }

    private ChannelSftp getChannelSftp() throws JSchException {
        Session session = initSession(this.host, this.port, this.userName, this.password);
        ChannelSftp channel = (ChannelSftp) session.openChannel("sftp");
        channel.connect();
        return channel;
    }

    private Session initSession(String host, int port, String userName, String password) throws JSchException {
        JSch jsch = new JSch();
        Session session = jsch.getSession(userName, host, port);
        session.setPassword(password);
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect();
        return session;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
