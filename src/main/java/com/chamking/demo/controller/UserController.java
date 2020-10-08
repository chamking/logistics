package com.chamking.demo.controller;

import com.chamking.demo.entity.User;
import com.chamking.demo.service.UserService;
import com.chamking.demo.util.JsonResult;
import com.chamking.demo.util.StrUtils;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/79:28
 * description:d
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public JsonResult login(String loginId, String password, HttpSession session) {
        User user = userService.login(loginId, password);
        session.setAttribute(StrUtils.LOGIN_USER, user);
        return new JsonResult(1, user);
    }
    @RequestMapping("/logOut.do")
    public  JsonResult logOut(HttpSession session){
        session.invalidate();
        return new JsonResult(1,"注销登录成功");
    }

}

