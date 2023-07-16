package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.HelloWorldConfiguration;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGaming;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpringApp {
    public static void main(String[] args) {

        //1: Launch a Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            //2: Configure the things that we want Spring to manage
            // HelloWorldConfiguration - @Configuration
            // name - @Bean

            //3: Retrieveing Beans managed by Spring
            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("person2"));

            System.out.println(context.getBean("person3"));

            System.out.println(context.getBean("person4"));

            System.out.println(context.getBean("address2"));

            //System.out.println(context.getBean(Address.class));

            System.out.println(context.getBean("person5QyalifierParameters"));

            System.out.println("\n-- Beans list --");
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }

    }
}