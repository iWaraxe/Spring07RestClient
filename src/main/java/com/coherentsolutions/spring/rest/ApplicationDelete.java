package com.coherentsolutions.spring.rest;

import com.coherentsolutions.spring.rest.configuration.MyConfig;
import com.coherentsolutions.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ApplicationDelete {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        communication.deleteEmployee(53);
    }
}
