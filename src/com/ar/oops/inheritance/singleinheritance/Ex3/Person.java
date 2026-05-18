package com.ar.oops.inheritance.singleinheritance.Ex3;

public class Person {
   private String name ;
  private   int age ;
  //constructor declaration
     public Person( String name , int age){
         this.name= name;
         this.age= age;

     }
// setter  and getter method
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //method declaration
    void displayPerson(){
        System.out.println(" Person Name is: "+ name);
        System.out.println("Person age is: "+ age);
    }
}
