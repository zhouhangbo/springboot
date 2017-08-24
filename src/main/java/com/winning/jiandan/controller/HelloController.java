package com.winning.jiandan.controller;

import com.winning.jiandan.model.User;
import com.winning.jiandan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhouhangbo on 2017/8/22.
 */
@Controller
@EnableAutoConfiguration
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    @Transactional
    String home() {

        userService.test();

        List<User> users  = userService.query();
        return "Hello World!";
    }

}
