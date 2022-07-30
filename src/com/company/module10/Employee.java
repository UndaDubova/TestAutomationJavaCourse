package com.company.module10;

import java.util.List;

public class Employee extends Person {
    String jobTitle;
    String company;
    Double salary;

    public Employee() {
    }

    public Employee(String name, int age, String jobTitle, String company, Double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee(String jobTitle, String company, Double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static String getHighestPaidEmp(List<Employee> empList) {
        Employee temp = empList.get(0);
        double salary = temp.getSalary();
        String tempJob = temp.getJobTitle();


        for (int i = 0; i < empList.size(); i++) {
            temp = empList.get(i);
            if (salary < temp.getSalary()) {
                salary = temp.getSalary();
                tempJob = temp.getJobTitle();
            }

        }
        return tempJob;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + name + " and i am " + age + " years old\n" +
                "\t   I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }


}

