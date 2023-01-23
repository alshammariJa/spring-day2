package com.example.week3dat2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week3Dat2Application {

    public static void main(String[] args) {
        SpringApplication.run(Week3Dat2Application.class, args);
    }
    @Bean
    @Qualifier("1")
    public  String getMsg1(MainController mainController){
        System.out.println("hi from msg 1");
        return "1";
        //    outPut
        //hi from msg 1
    }
    @Bean
    @Qualifier("2")
    public String getMsg2( @Qualifier("3") String data){
        System.out.println("hi from msg 2");
        return data;
//        outPut
//        hi from msg 1
//        hi from msg 2
    }
    @Bean
    @Qualifier("3")
    public String getMsg3(){
        System.out.println("hi from msg 3");
        return "3";
//        outPut
//        hi from msg 1
//        hi from msg 3
//        hi from msg 2
    }

}
