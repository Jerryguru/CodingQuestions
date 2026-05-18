package com.ar.oops.inheritance.singleinheritance.Ex3;

import java.sql.SQLOutput;

public class EmployeeMain {
  public static void main(String[] args) {
      Employee e1 = new Employee("Jerry Paramesh", 27 ,"Amazon",83256);
      System.out.println("Person Details: "+ e1.getName());
      System.out.println("Person Age Details: "+ e1.getAge());
      System.out.println("Company Details: "+ e1.getCompany());
      System.out.println("Compamny Salary Details: "+ e1.getSalary());


    }
}
