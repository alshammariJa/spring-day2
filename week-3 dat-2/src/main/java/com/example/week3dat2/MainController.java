package com.example.week3dat2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MainController {
    String data;
    public MainController(@Qualifier("2") String data){
        this.data=data;
        System.out.println("hey from main controller");

//        outPut
//        hi from msg 1
//        hey from main controller
//        hi from msg 3
//        hi from msg 2

//        outPut

//        hi from msg 3
//        hi from msg 2
//        hey from main controller
//        hi from msg 1
    }
}
