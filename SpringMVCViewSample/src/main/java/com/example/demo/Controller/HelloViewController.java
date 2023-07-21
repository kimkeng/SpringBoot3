package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloViewController {
    /* PostMapping은 폼태그에다가만 사용 가능 */
    @GetMapping("view")
    public String helloView(){
        return "hello";
    }
    @GetMapping("view2")
    public String helloView2(){
        return "hello2";
    }
}
