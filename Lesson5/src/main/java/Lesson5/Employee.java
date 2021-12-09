package Lesson5;

import java.util.Map;

public class Employee {

    private String fullName;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String employeeFullname, String job, String email, String phone, int salary, int age) {
        this.fullName = employeeFullname;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    private String getInfo(){

        String result = "Full Name: " + this.fullName;
        result += " Job: " + this.job;
        result += " Age: " + this.age;
        result += " Salary: " + this.salary;

        return result;
    }

    public int getAge() {
        return this.age;
    }

    public void printInfo(){
        System.out.println(getInfo());
    }

}
