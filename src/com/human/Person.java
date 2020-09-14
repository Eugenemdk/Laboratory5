package com.human;

public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.println("Person: "+getName()+" "+getSurname()+" His Age: "+getAge());
    }


}
