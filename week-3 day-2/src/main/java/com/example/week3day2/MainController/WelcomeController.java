package com.example.week3day2.MainController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
  @GetMapping("/name")
    public String getName(){

        return "my name is jamelah";
    }
    @GetMapping("/age")
    public int myAge(){
      return 26;
    }
    @GetMapping("/check/status")
    public String checkStatus(){
     return "Everything OK";
    }
    @GetMapping("/health")
    public  String health (){
      return "Server health is up and running";
    }
}
