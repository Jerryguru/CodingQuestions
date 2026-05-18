package com.ar.oops.inheritance.singleinheritance;

public class HomeTown {
   public static void main(String[] args) {
       Town t1 = new Town("Proddatur", 21, "Modampalli");
       System.out.println(t1.getArea());
       System.out.println(t1.getHouseNum());
       System.out.println(t1.getplace());
       System.out.println("************************************************");
       t1.houseAdress();
       t1.findArea();

    }


}
