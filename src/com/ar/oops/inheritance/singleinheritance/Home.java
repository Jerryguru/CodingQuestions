package com.ar.oops.inheritance.singleinheritance;

public class Home {
   private String area ;
   private int houseNum ;
    public Home (String area,int houseNum){
        this.area = area;
        this.houseNum = houseNum;
    }
    void houseAdress(){
        System.out.println(area + " is our hometown place");
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getHouseNum() {
        return houseNum;
    }
    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }



}
