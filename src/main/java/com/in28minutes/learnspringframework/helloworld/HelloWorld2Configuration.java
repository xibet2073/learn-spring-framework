package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorld2Configuration {
    @Bean
    public String name(){
        return "Marco";
    }

    @Bean
    public int age() {
        return 50;
    }
    @Bean
    public Person person() {
        return new Person("Donald", 77, new Address("Tampa Street", "Miami"));
    }
    @Bean
    public Person person2() {
        return new Person(name(), age(), address()); //calling other beans
    }
    @Bean
    public Person person3(String name, int age, Address address1) {
        return new Person(name, age, address1);
    }
    @Bean
    public Person person4(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean
    //No qualifying bean of type 'com.in28minutes.learnspringframework.Address' available:
    // expected single matching bean but found 2: address1,address2
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5QyalifierParameters(String name, int age,
                                             @Qualifier("address3Qualifier")Address address) {
        return new Person(name, age, address);
    }
    @Bean
    @Primary
    public Address address0() {
        return new Address("Piccadilly Circus (address0)", "London");
    }

    @Bean
    public Address address1() {
        return new Address("Piccadilly Circus", "London");
    }
    @Bean(name = "address2")
    @Qualifier("address3Qualifier")
    public Address address() {
        return new Address("Baker Street", "London");
    }
}
