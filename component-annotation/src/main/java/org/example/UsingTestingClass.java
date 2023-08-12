package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsingTestingClass {

    @Autowired
    TestingClass testingClass;

    public void makeACallToTestinClass() {
        testingClass.displayInTestingClass();
    }


}
