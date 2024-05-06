package com.coherentsolutions.spring.rest;

import com.coherentsolutions.spring.rest.configuration.MyConfig;
import com.coherentsolutions.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ApplicationPut {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        Employee employee = new Employee("Maria",
                "Lapina",
                "IT",
                5000,
                "Wonder Woman");
        employee.setId(53);
        communication.saveEmployee(employee);
    }
}
