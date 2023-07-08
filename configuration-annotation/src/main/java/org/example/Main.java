package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeansConfig.class);

        Student studentObj = ac.getBean(Student.class);
        studentObj.displayStudentMessage();

        Person personObj = ac.getBean("getPerson", Person.class);
        personObj.displayPersonMessage();

        Person personObjWithName = ac.getBean("getPersonWithNameFunc",Person.class);
    }

}