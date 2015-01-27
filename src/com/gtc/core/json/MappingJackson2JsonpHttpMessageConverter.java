package com.gtc.core.json;


import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MappingJackson2JsonpHttpMessageConverter extends MappingJackson2HttpMessageConverter {

    @Autowired
    private HttpServletRequest request;

    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        JsonEncoding encoding = getJsonEncoding(outputMessage.getHeaders().getContentType());
        JsonGenerator jsonGenerator = this.getObjectMapper().getJsonFactory().createJsonGenerator(outputMessage.getBody(), encoding);
        String jsonPadding = request.getParameter("callback");
        if (StringUtils.isEmpty(jsonPadding)) {
            this.getObjectMapper().writeValue(jsonGenerator, object);
        } else {
            jsonGenerator.writeRaw(jsonPadding);
            jsonGenerator.writeRaw("(");
            this.getObjectMapper().writeValue(jsonGenerator, object);
            jsonGenerator.writeRaw(")");
        }
        jsonGenerator.flush();
    }
}
