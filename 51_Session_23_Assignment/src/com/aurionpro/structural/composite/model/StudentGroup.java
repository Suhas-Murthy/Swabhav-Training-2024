package com.aurionpro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Student {
 private List<Student> students = new ArrayList<>();

 public void add(Student student) {
     students.add(student);
 }

 public void remove(Student student) {
     students.remove(student);
 }

 public Student getStudent(int index) {
     return students.get(index);
 }

 @Override
 public void showDetails() {
     for (Student student : students) {
         student.showDetails();
     }
 }
}

