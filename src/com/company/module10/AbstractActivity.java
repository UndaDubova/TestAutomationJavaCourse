package com.company.module10;

public class AbstractActivity {

    Students student1 = new Students();
    Employee employee1 = new Employee();

    public AbstractActivity() {
    }

    public void callMethods() {

        employee1.introduce();
        student1.introduce();
    }
}
