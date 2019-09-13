package com.spring.learn.controllercollection;

import com.spring.learn.modelclasses.Taco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/test")
    public String test(Taco design) {
        System.out.println(design.toString());
        return "design";
    }
}
