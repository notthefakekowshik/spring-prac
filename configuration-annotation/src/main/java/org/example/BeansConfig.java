package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public Student getStudent(){
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
