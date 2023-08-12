package com.cydeo.bootStrap;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Getter
public class myRandom {

    private final Random random;

    public myRandom() {
        this.random = new Random();
    }
}
