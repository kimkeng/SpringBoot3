package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet {
    @Override
    public void greeting() {
        System.out.println("----------");
        System.out.println("--굿나잇--");
        System.out.println("----------");
    }
}
