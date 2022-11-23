package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al,new AgeComparotor());
        for(Student st:al){
            System.out.println(st.marks+" "+st.name+" "+st.age);
        }
        System.out.println("/n Marks Sorted");
        Collections.sort(al,new MarksComparator());
        for(Student st:al){
            System.out.println(st.marks+" "+st.name+" "+st.age);
        }

    }

}
