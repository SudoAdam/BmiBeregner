package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping ("/")
    public String index (){
        return "index";
    }

    @GetMapping ("/calculator")
    public String calculator (){
        return "calculator";
    }

    @PostMapping("/calc")
    public String calc (@RequestParam int num1, @RequestParam double num2, Model model ){
        Services services = new Services();
       double num3 = num1 / (num2 * num2);
       num3 = (Math.round(num3*100.0))/100.0;
       model.addAttribute("calc",num3);
        return "result";
    }

    @GetMapping ("/error")
    public String error (){
        return "error";
    }

}
