package com.cydeo.bootStrap;

import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Component
public class DataGenerate {
    myFaker faker;
    myRandom random;

    public List<Mentor> getMentorList(int num) {
        List<Mentor> mentorList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Mentor mentor = new Mentor(faker.getMyfaker().name().firstName(),
                    faker.getMyfaker().name().lastName(),
                    random.getRandom().nextInt(32) + 18,
                    Arrays.asList(Gender.values()).get(random.getRandom().nextInt(2)).getValue());

            mentorList.add(mentor);
        }
        return mentorList;

    }
}
