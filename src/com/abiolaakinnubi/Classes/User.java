package com.abiolaakinnubi.Classes;

import com.abiolaakinnubi.Enums.Gender;
import com.abiolaakinnubi.Enums.Race;

public class User {
    public User(int userId, String userFullName, double salary, Gender gender, Race race, int age) {
        this.userId = userId;
        this.userFullName = userFullName;
        this.salary = salary;
        this.gender = gender;
        this.race = race;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int userId;
    public String userFullName;
    public double salary;
    public Gender gender;
    public Race race;
    public int age;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userFullName='" + userFullName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", race=" + race +
                ", age=" + age +
                '}';
    }
}
