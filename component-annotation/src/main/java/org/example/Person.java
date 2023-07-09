package org.example;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("person-class")
public class Person implements Human{
    @Override
    public void action() {
        System.out.println("person in action");
    }

}
