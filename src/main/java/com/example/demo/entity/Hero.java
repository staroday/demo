package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
public class Hero {
    private Integer hp;
    private Integer ack;
    public Hero(){

    }
//    public Hero(Integer Hp,Integer ack){
//        this.hp=Hp;
//        this.ack=ack;
//    }
    public Hero attack(Hero hero){
        hero.hp=hero.hp-this.ack;
        return hero;
    }













//    @Setter @Getter
//    public Long id;
//    @Setter @Getter
//    public int Hp;
//    @Setter @Getter
//    public int Mp;
//    @Setter @Getter
//    public int ack;
//    public Hero(){
//
//    }
//    public Hero( int hp, int ack,int Mp) {
//        this.Hp = hp;
//        this.Mp = Mp;
//        this.ack=ack;
//    }
//    @Override
//    public String toString(){
//        final StringBuffer sb=new StringBuffer("Hero");
//        sb.append("80");
//        sb.append("80");
//        sb.append("80");
//
//        return sb.toString();
//    }


}
