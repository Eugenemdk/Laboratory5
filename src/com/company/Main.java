package com.company;

import com.human.Person;
import com.human.Student;
import com.human.Lecturer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Person person1=new Lecturer();
    person1.setName("Steve");
    person1.setSurname("McAllen");
    person1.setAge(34);
    Lecturer prs1=(Lecturer) person1;
    prs1.setFaculty("Mathematic");
    prs1.setSalary(5500);


    Person person2 =new Student();
        person2.setName("Yevhen");
        person2.setSurname("Medyanik");
        person2.setAge(25);
        Student prs2=(Student) person2;
        prs2.setGroup("EAD-192");
        prs2.setStudentPass("AB-1900");

    Person person=new Person();
        person.setName("Robert");
        person.setSurname("Kiyosaki");
        person.setAge(67);

       ArrayList<Person> department=new ArrayList<Person>();
        department.add(person);
        department.add(prs1);
        department.add(prs2);
    for(int index=0;index<department.size();index++){
        department.get(index).printInfo();
    }




    }
}
