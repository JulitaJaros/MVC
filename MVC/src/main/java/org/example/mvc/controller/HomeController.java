package org.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String getAbout(){
        return "about/aboutUs";
    }

    @PostMapping("/")
    public String getAbout2(){
        return "about/aboutUs";
    }
}
