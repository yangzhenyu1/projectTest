package com.talkweb.controller;

import com.talkweb.entity.User;
import com.talkweb.service.LoginService;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by talkweb_y on 2018/10/12.
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("queryUserById")
    @ResponseBody
    public User queryUserById(String name, String password, HttpServletRequest req){
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        //Subject subject = SecurityUtils.getSubject();
        //System.out.println("token="+token);
        //System.out.println("subject="+subject);
        //String attribute = (String) req.getSession().getAttribute("rand");
        return loginService.findById(1);
    }
}
