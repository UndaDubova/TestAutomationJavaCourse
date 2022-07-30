package com.company.module10;

import java.util.*;


public class EmployeeList {
    public static void main(String[] args) {

        Employee employeeObject1 = new Employee(" janitor", " Company", 102d);
        Employee employeeObject2 = new Employee(" teacher", " Company", 103d);
        Employee employeeObject3 = new Employee(" director", " Company", 104d);
        Employee employeeObject4 = new Employee(" lazypants", " Company", 130d);
        Employee employeeObject5 = new Employee(" security", " Company", 102d);
        List<Employee> empList = new ArrayList<Employee>();

        empList.add(employeeObject1);
        empList.add(employeeObject2);
        empList.add(employeeObject3);
        empList.add(employeeObject4);
        empList.add(employeeObject5);

        System.out.println(" The Employee whose salary is the highest is :" + Employee.getHighestPaidEmp(empList));
    }


}
