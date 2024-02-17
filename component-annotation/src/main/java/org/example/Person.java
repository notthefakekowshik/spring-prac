package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("personn")
public class Person implements Human{
    @Override
    public void action() {
        System.out.println("person in action");
    }

}
