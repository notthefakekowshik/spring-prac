package org.example;

public class Person {
    String name;
    Person(){}
    Person(String name){
        System.out.println("hello " +name);
    }
    public void displayPersonMessage() {
        System.out.println("hello person");
    }
}
