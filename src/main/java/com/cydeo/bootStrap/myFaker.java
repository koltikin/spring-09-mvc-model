package com.cydeo.bootStrap;

import com.github.javafaker.Faker;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class myFaker {
    private final Faker myfaker;

    public myFaker() {
        this.myfaker = new Faker();
    }
}
