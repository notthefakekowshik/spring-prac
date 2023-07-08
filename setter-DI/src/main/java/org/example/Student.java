package org.example;


public class Student {
    String name;

    Person person;

    public void setPerson(Person person){
        this.person = person;
    }

    public Person getPerson(){
        return this.person;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
