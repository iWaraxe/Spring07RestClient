package com.coherentsolutions.spring.rest.entity;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;
    private String heroName;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary, String heroName) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.heroName = heroName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", heroName='" + heroName + '\'' +
                '}';
    }
}
