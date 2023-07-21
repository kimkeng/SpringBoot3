package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloModelController {
    @GetMapping("model") //타임이프에서 전달하는 변수들이 생기면 전달이 가능하게 만드는게 model 인터페이스
    public String helloView(Model model){
        model.addAttribute("msg" , "타임리프!!!");
        model.addAttribute("name" , "갱");
        return "helloThymeleaf";
    }
}
