package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfig {

    @Bean
    @Primary
    public Student getStudent() {
        System.out.println("in the main student bean " + this);
        return new Student();
    }

    @Bean
    public Student getStudentDup() {
        System.out.println("called student dup " + this);
        return new Student();
    }

    @Qualifier("getPersonWithName")
    @Bean
    public Person getPersonWithNameFunc() {
        return new Person("kowshik");
    }
    @Bean
    @Qualifier("personWithNoName")
    public Person getPerson(){
        return new Person();
    }

    /**
     * ikada qualifier ledu anuko, eh bean pick cheskovalo ardhamkadu,
     * NoUniqueBeanFoundException ostundi.
     */

}
