package com.human;

public class Lecturer extends Person {
    protected String faculty;
    protected float salary;

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }



    @Override
    public void printInfo(){
        System.out.println("Lecturer of faculty :"+getFaculty()+" "+ getName()+" "+getSurname()+" His age: "+getAge()+" His salary:"+getSalary());
    }
}
