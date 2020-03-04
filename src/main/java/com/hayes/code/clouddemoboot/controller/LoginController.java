package com.hayes.code.clouddemoboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @RequestMapping("")
    public String login_index() {

        return "login" ;

    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if( username!=null  && password != null){

            if (!"admin".equals(username)){
                return "用户名错误";
            }
            if (!"admin".equals(password)){
                return "密码错误";
            }
            return "登陆成功" ;
        }else{
            return "请输入用户名和密码";
        }
    }


}
