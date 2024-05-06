package com.coherentsolutions.spring.rest;

import com.coherentsolutions.spring.rest.configuration.MyConfig;
import com.coherentsolutions.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * REST Client
 */
public class ApplicationGet {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        allEmployees.forEach(System.out::println);

        Employee employeeById = communication.getEmployeeById(23);
        System.out.println(employeeById);
    }
}
