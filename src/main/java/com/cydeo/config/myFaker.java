package com.cydeo.config;

import com.github.javafaker.Faker;
import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class myFaker {
    private final Faker myfaker;

    public myFaker() {
        this.myfaker = new Faker();
    }
}
