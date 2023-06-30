package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class MyApplicationController {

//    @Value("${name.test}")
//    public int a;

    @RequestMapping("/hello")
//    @ResponseBody
    public String quick(){
        return "/img/1.jpg";
    }


    @RequestMapping("/getPage")
//    @ResponseBody
    public String getPage(){
        return "/img/test.html";
    }


}
