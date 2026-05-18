package com.ar.oops.inheritance.singleinheritance;

public class Town  extends  Home {
    private String place;

    public Town(String area, int houseNum, String place) {
        super(area, houseNum);
        this.place = place;
    }

    void findArea() {
        System.out.println( getplace() +  " is our area adress");

    }

    public String getplace() {
        return place;

    }

    public void setplace(String place) {
        this.place = place;
    }


}
