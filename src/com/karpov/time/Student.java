package com.karpov.time;

import java.util.Comparator;
import java.util.Objects;

public class Student  {
    private int age;
    private double height;

    public Student() {
    }

    public Student(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }






}
