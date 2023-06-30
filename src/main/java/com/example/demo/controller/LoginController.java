package com.example.demo.controller;

import com.example.demo.entity.Hero;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
//    @RequestMapping(value = "/login")
//    @ResponseBody
//    public String name(String name,String pwd){
//        if(!name.isEmpty()&&pwd.isEmpty()){
//            return "用户名与密码不能为空";
//        }
//        if(!name.equals("yyq")){
//            return "用户名错误";
//        }
//        if(!pwd.equals("123456")){
//            return "密码错误";
//        }
//        if(name.equals("yyq")&&pwd.equals("123456")){
//            return "hello"+name;
//        } else {
//            return "登录失败";
//        }
//    }
    @PostMapping("/login")
    @ResponseBody
    public User name(@RequestBody User user){

        return user;
    }
//    @PostMapping("/loginName")
//    public String name(){
//        return null;
//    }
}
