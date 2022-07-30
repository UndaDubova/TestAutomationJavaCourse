package com.company.module10;

public class Students extends Person {
    String schoolName;

    public Students() {
    }

    public Students(String schoolName) {
        this.schoolName = schoolName;
    }

    public Students(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("I am a student in an university: " + schoolName);
    }
}
