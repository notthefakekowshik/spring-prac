package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("student-class")
public class Student implements Human {

    @Override
    public void action() {
        System.out.println("student in action");
    }

}
