package com.xiaoyuan.jdk.eight.pojo;

import java.util.Objects;

public class Student {

    private String username;

    private Integer age;

    private String gender;

    private Integer grade;

    public Student() {
    }

    public Student(String username, Integer age, String gender, Integer grade) {
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(getUsername(), student.getUsername()) &&
                Objects.equals(getAge(), student.getAge()) &&
                Objects.equals(getGender(), student.getGender()) &&
                Objects.equals(getGrade(), student.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getAge(), getGender(), getGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                '}';
    }
}
