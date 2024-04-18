package com.icodeap.eventos.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping("/home")
@RestController
public class HomeController {

   /* @GetMapping
    public String home(){
        return "home";
    }*/

    @GetMapping("/")
    public String inicio(){
        return "Hola Mundo";
    }
}
