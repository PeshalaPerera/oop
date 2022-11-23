package com.company;

public class Student implements Comparable<Student> {
    int age;
    int marks;
    String name;

    public Student(int age, String name,int marks) {
        this.age = age;
        this.marks = marks;
        this.name = name;
    }


    @Override
    public int compareTo(Student st) {
        if(marks==st.marks)
            return 0;
        else if(marks>st.marks)
            return 1;
        else
            return -1;

    }
}
