package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeansConfig.class);
        //ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(BeansConfig.class);
//        ac.registerShutdownHook();
//        ac.close();

        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        Student studentObj = ac.getBean(Student.class);
        studentObj.displayStudentMessage();

        Person personObj = ac.getBean("getPerson", Person.class);
        personObj.displayPersonMessage();

        Person personObjWithName = ac.getBean("getPersonWithNameFunc",Person.class);
        personObjWithName.displayPersonMessage();


    }

}