package com.cydeo.model;

import lombok.Getter;
@Getter
public enum Gender {
    MALE("male"),FEMALE("female");
    final String value;

    Gender(String gender) {
        this.value = gender;
    }
}
