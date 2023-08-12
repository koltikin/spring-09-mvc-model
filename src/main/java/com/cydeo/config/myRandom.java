package com.cydeo.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@Getter
public class myRandom {

    private final Random random;

    public myRandom() {
        this.random = new Random();
    }
}
