package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class Maintest {


    public static void main(String[] args) {
        Student s1 = new Student(12, "naneeth", 22);
        Student s2 = new Student(70, "gavrav", 26);
        Student s3 = new Student(45, "nan", 20);
        Student s4 = new Student(29, "sai", 87);
        Student s5 = new Student(19, "ram", 27);
        List<Student> list = new ArrayList<>();
        list.add(s1);
    }

}