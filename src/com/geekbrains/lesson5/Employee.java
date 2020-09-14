package com.geekbrains.lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String phone;
    private int salary;
    private int age;


    Employee(String fullName,String position, String eMail, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
}

    public void employeeInfo(){
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Mail: " + eMail);
        System.out.println("Phone number: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public int getAge(){
        return age;
    }
}
