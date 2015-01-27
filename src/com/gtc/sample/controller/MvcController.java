package com.gtc.sample.controller;

import com.gtc.core.json.JSONP;
import com.gtc.os.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("spc")
public class MvcController {
    Log log = LogFactory.getLog(MvcController.class);

    /**
     * access sample/sampleView.jsp
     *
     * @return
     */
    @RequestMapping("sampleView")
    public String getSampleView() {
        return "sample/sampleView";
    }

    @RequestMapping(value = "getString")
    @ResponseBody
    public String getString() {
        return "sample/sampleView";
    }

    @RequestMapping(value = "getUser", produces = "application/json;")
    @ResponseBody
    @JSONP
    public User geUser() {
        User user = new User();
        user.setUserCode("1");
        user.setUserName("userName");
        return user;
    }

    @RequestMapping(value = "getUserList", produces = "application/json;")
    @ResponseBody
    public List<User> geUserList() {
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setUserCode("1");
        user.setUserName("userName");

        User user2 = new User();
        user.setUserCode("2");
        user.setUserName("userName2");

        list.add(user);
        list.add(user2);
        return list;
    }

    @RequestMapping(value = "getUserMap", produces = "application/json;")
    @ResponseBody
    public Map<String, Object> geUserMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        User user = new User();
        user.setUserCode("1");
        user.setUserName("userName");

        User user2 = new User();
        user.setUserCode("2");
        user.setUserName("userName2");

        map.put("user1", user);
        map.put("user2", user2);
        map.put("integer", 1);
        map.put("string", "string");
        map.put("boolean", true);
        return map;
    }

    @RequestMapping("getInt")
    @ResponseBody
    @JSONP
    public int getInt() {
        return 1;
    }


}
