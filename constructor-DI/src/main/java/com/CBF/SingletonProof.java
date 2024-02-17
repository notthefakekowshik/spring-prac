package com.CBF;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonProof {

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("xml_data.xml");
        Student kowshikObjBF = (Student) bf.getBean("k-obj");
        kowshikObjBF.displayName();
        System.out.println(kowshikObjBF.hashCode());
        System.out.println("=======");
        kowshikObjBF = (Student) bf.getBean("k-obj");
        kowshikObjBF.displayName();
        System.out.println(kowshikObjBF.hashCode());
        /*
            to validate, go to xml_data.xml and add scope=" " and run this, you will find the difference.
         */
        System.out.println("---------------------------");
        ApplicationContext ac = new ClassPathXmlApplicationContext("xml_data.xml");
        Student kowshikObjAC = ac.getBean("k-obj" , Student.class);
        System.out.println(kowshikObjAC.hashCode());
        kowshikObjAC.displayName();

        System.out.println("=======");
        kowshikObjAC = ac.getBean("k-obj", Student.class);
        System.out.println(kowshikObjAC.hashCode());
        kowshikObjAC.displayName();

    }
}
