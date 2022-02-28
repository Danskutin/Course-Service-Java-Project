package com.courseserviceproject.courseservice;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class Course {

    private String courseId;
    protected String courseName;
    private String teacherName;
    private String classRoom;
    private Boolean onlineCourse;

    public List<Student> registeredStudents = new ArrayList<>();

    public Course() {
        this("", "", "", null);
    }

    public Course(String courseName, String teacherName, String classRoom, Boolean onlineCourse) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.classRoom = classRoom;
        this.onlineCourse = onlineCourse;
    }

    // Get / Generate CourseID
    public String getCourseId() {
        courseId = courseName.substring(0, 3) + teacherName.substring(0, 3);
        System.out.println(courseId);
        return this.courseId;
    }

    // Get Course Name
    public String getCourseName() {
        return this.courseName;
    }

    // Set Course Name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Get Course Classroom
    public String getClassRoom() {
        return this.classRoom;
    }

    // Set Course Classroom
    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    // Get Course Teacher Name
    public String getTeacherName() {
        return this.teacherName;
    }

    // Set Course Teacher Name
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    // Get Registered Students
    public List<Student> getStudents() {
        return this.registeredStudents;
    }

    // Set Registered Students
    public void setStudents(List<Student> students) {
        this.registeredStudents = students;
    }

    // Get List of Registered Students
    public List<Student> getStudentList() {
        return new ArrayList<>(this.registeredStudents); 
    }

    // Add Student / Returns Boolean Value
    public boolean addStudent(Student student){

       if(registeredStudents.contains(student)){
           return false;
       }else{
        registeredStudents.add(student);
           return true;
       }

    }

    // Remove Student from Registered Students Array
    public void deleteStudent(Student student){  
        if(registeredStudents.contains(student)){
            registeredStudents.remove(student);
        }
    }
    
}
   



