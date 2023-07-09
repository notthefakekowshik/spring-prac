package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeansConfig.class);

        Employee e = ac.getBean(Employee.class);
        e.displayMessage();

    }
}
