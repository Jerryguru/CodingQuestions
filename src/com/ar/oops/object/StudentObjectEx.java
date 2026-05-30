package com.ar.oops.object;

public class StudentObjectEx {

    private String name;
    private int rollnum;
    private String collegename;

    // Constructor
    public StudentObjectEx(String name, int rollnum, String collegename) {

        this.name = name;
        this.rollnum = rollnum;
        this.collegename = collegename;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollnum() {
        return rollnum;
    }

    public String getCollegename() {
        return collegename;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public static void main(String[] args) {

        StudentObjectEx soe1 =
                new StudentObjectEx("Jerry Paramesh", 106, "JNTUA");

        StudentObjectEx soe2 =
                new StudentObjectEx("Paramesh", 101, "JNTK");

        StudentObjectEx soe3 =
                new StudentObjectEx("Jerry", 108, "OU");

        System.out.println(soe1.getName());
        System.out.println(soe1.getRollnum());
        System.out.println(soe1.getCollegename());

        System.out.println("****************");

        System.out.println(soe2.getName());
        System.out.println(soe2.getRollnum());
        System.out.println(soe2.getCollegename());
    }
}