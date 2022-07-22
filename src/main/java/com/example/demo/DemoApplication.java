package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("hi");

        ClassPathXmlApplicationContext abc = new ClassPathXmlApplicationContext("test.xml");
        abc.getBean("placeholderConfig");

        System.out.println("bean " + abc);
    }
}
