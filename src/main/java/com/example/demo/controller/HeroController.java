package com.example.demo.controller;

import com.example.demo.entity.Hero;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {

//    @PostMapping("/hero")
//    @ResponseBody
//    public Hero name(@RequestBody Hero hero){
//
//        return hero;
//    }
    @PostMapping("/hero")
    @ResponseBody
    public Hero attack(@RequestBody Hero hero){
        hero = new Hero(100,50).attack(hero);
        return hero;
    }
}
