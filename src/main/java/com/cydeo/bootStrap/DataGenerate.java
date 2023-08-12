package com.cydeo.bootStrap;

import com.cydeo.config.myFaker;
import com.cydeo.config.myRandom;
import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerate {
    myFaker faker;
    myRandom random;

    public DataGenerate(myFaker faker, myRandom random) {
        this.faker = faker;
        this.random = random;
    }

    public List<Mentor> getMentorList(int num) {
        List<Mentor> mentorList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Mentor mentor = new Mentor(faker.getMyfaker().name().firstName(), faker.getMyfaker().name().lastName(),
                    random.getRandom().nextInt(32) + 18, Arrays.asList(Gender.values()).get(random.getRandom().nextInt(2)).getValue());
            mentorList.add(mentor);
        }
        return mentorList;


    }
}
