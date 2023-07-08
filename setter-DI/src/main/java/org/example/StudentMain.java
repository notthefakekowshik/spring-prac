package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

    public static void main(String[] args) {
        /**
         *  Simple DI for setter functions
         */
        BeanFactory StudentBF = new ClassPathXmlApplicationContext("xml_data.xml");
        Student kowshikObjBF = (Student) StudentBF.getBean("k-obj");
        System.out.println(kowshikObjBF.name);
        kowshikObjBF.getName(); //but why is this not printing anything? idk

        BeanFactory PersonBF = new ClassPathXmlApplicationContext("xml_data.xml");
        Person PersonObjBF = (Person) PersonBF.getBean("person-obj");
        System.out.println(PersonObjBF.name);
        PersonObjBF.getName(); //but why is this not printing anything? idk

        ApplicationContext PersonAC = new ClassPathXmlApplicationContext("xml_data.xml");
        Person PersonObjAC = (Person) PersonAC.getBean(Person.class);
        System.out.println("AC of person -> " + PersonObjAC.name);
        PersonObjAC.getName();

        System.out.println("Demonstrating DI with has a relationship");

        /**
         * DI for setter functions with Ref
         */
        BeanFactory StudentRefBF = new ClassPathXmlApplicationContext("xml_data.xml");
        Student kowshikRefObjBF = (Student) StudentRefBF.getBean("kowshik-ref-obj");
        System.out.println(kowshikRefObjBF.person.name);
        kowshikRefObjBF.getPerson().getName(); //but why is this not printing anything? idk

        ApplicationContext StudentRefAC = new ClassPathXmlApplicationContext("xml_data.xml");
        Student kowshikRefObjAC = (Student) StudentRefAC.getBean("kowshik-ref-obj",Student.class);
        System.out.println(kowshikRefObjAC.person.name);
    }
}
