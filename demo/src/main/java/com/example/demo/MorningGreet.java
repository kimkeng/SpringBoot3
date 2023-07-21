package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
public class MorningGreet implements Greet {
    @Override
    public void greeting() {
        System.out.println("----------");

        System.out.println("--굿뭘닝--");
        System.out.println("----------");
    }
}
