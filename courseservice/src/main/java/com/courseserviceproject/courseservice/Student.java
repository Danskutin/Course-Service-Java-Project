package com.courseserviceproject.courseservice;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;


    public Student(){
        this("","");
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Get / Generate Student ID
    public String getStudentId() {
        studentId = lastName.substring(0, 3) + firstName.substring(0, 3);
        System.out.println(studentId);
        return this.studentId;
    }

    // Get Student First Name
    public String getFirstName() {
        return this.firstName;
    }

    // Set Student First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Get Student Last Name
    public String getLastName() {
        return this.lastName;
    }

    // Set Student Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // Get Student Full Name
    @Override
    public String toString() {
        return this.lastName + " " + this.firstName;
    }    
}