package com.courseserviceproject.courseservice;

public class LocalCourse extends Course {
    
    private String classRoom;
    private static int limit = 25;
    private static int studentCount = 0;

    public LocalCourse(String classRoom, String courseName, String teacherName, String room)
    {
        super(courseName, teacherName, room, null);
        this.classRoom = classRoom;
        
    }

    // Get Class Room
    public String getClassRoom(){
        return this.classRoom;
    }

    // Set Class Room
    public void setClassRoom(String classRoom){
        this.classRoom = classRoom;
    }

    // Add Student To Local Course
    @Override
    public boolean addStudent(Student student){
        if(studentCount < limit){
            super.addStudent(student);
            studentCount++;
            return true;
        } else{
            System.out.println("There's no more room on the course!");
            return false;
        }
        
    }

    // Return Course Description
    @Override
    public String toString() {
        return String.format(getCourseName() + " " + getTeacherName() + " " + getClassRoom());
    }    
}