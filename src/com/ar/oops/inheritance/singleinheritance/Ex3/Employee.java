package com.ar.oops.inheritance.singleinheritance.Ex3;

public class Employee  extends  Person{
   private String company;
   private double salary ;
   // constructor declaration
    public Employee ( String name , int age , String company,double salary) {
         // here calling a parent constructor
        super(name , age);
        this.company= company;
        this.salary= salary;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    void displayEmployee(){
        System.out.println("Name: "+ getName());
        System.out.println("ageL: "+ getAge());
        System.out.println("******************");
        System.out.println("Company: "+ company);
        System.out.println("Salary: "+ salary);
    }
}
