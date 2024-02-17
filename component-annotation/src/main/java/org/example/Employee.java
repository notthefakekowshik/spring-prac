package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Qualifier("personn")
    @Autowired
    Human human; /* This will be exception but when?
    human ni two classes implement chestunay.
    IOC be like : neeku evari instance kavali rawww?

    1. nv qualifier pettakunda, either person or student class ki primary annotaton iste ok
    2. ikada qualifer annotation vadali. deentlo malli two cases
        a. component annotation pettinapdu adi automatic ga bean create chesestundi with the name same as class name but 1st letter will be small
            but nv annotation lopala name iste, aa name thone create chestundi.
            eg :
            @Component("kowshik-obj")
            class Kowshik
            bean's name will be kowshik-obj.
            -----------------
            class Kowshik
            bean's name will be kowshik.

        b. if you provide your own bean name apdu qualifier lo kooda aa bean name eh ivali
            @Component("student-obj")
            class Student{}

            bean's name will be student-obj.

            Employee.java :
            @Qualifier("your-bean-name") -> your-bean-name = "student-obj" in this case
            Human human;

            -----------------
            class Student{}
            bean's name will be student.

            Employee.java :
            @Qualifier("student")
            Human human;
            */

    public void displayMessage(){
        System.out.println("calling from employee");
        human.action();
    }
}
