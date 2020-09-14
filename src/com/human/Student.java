package com.human;

public class Student extends Person {
    protected String group;
    protected String studentPass;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }

    @Override
    public void printInfo(){
        System.out.println("Student :"+getGroup()+" "+ getName()+" "+getSurname()+" His age: "+getAge()+" Student pass :"+" "+getStudentPass());
    }

}
