package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "org.example")
public class StudentMain {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeansConfig.class);

        //ApplicationContext ac = new AnnotationConfigApplicationContext(StudentMain.class);
        Employee e = ac.getBean(Employee.class);
        e.displayMessage();

        UsingTestingClass usingTestingClass = ac.getBean(UsingTestingClass.class);
        usingTestingClass.makeACallToTestinClass();



    }
}
