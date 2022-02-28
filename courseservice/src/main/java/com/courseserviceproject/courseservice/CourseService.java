
package com.courseserviceproject.courseservice;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService {

    boolean find;
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();
    
    CourseService myCourseService;
    CourseFileService courseFileService = new CourseFileService();

    // Get List of Students
    @Override
    public List<Student> getStudents() {
        return students;
    }
   
    // Set List of Students
    public void setStudents(List<Student> students){
        this.students = students;
    }

    // Get Student Info By Student ID
    @Override
    public Student getStudentByID(String studentId) {
        
        for (Student a : students) {
            if(a.getStudentId() == studentId) {
                return a;
            }
        }
        return null;
    }

    // Get List of Courses
    @Override
    public List<Course> getCourses() {
        return courses;
    }

    // Set List of Courses
    public void setCourses(List<Course> courses){
        this.courses = courses;
    }

    // Get Course Info By Course ID
    @Override
    public Course getCourseByID(String courseId) {
        
        for (Course c : courses) {
            if(c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
    }

    // Get Courses Student Has Registered By Student ID
    @Override
    public List<Course> getCoursesOfStudent(String studentId) {
        return myCourseService.getCoursesOfStudent(studentId);
    }

    // Add Student to Course
    @Override
    public boolean addStudentToCourse(String studentId, String courseId) {
        for (Course c : courses) {

            if(c.getCourseId() == courseId){

                for (Student s : students) {
                    if(s.getStudentId() == studentId){

                    c.addStudent(s);
                    find = c.addStudent(s);
                    }
                }
            }
        }
        return find;
    }
    
    
}