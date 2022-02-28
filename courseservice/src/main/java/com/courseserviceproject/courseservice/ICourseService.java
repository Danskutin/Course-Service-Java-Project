package com.courseserviceproject.courseservice;
import java.util.List;

public interface ICourseService {
   
    // Get List of Students
    List<Student> getStudents();

    // Get List of Courses
    List<Course> getCourses();

    // Get Student By ID
    Student getStudentByID(String studentId);

    // Get Course By ID
    Course getCourseByID(String courseId);

    // Get List of Courses By Student ID
    List<Course> getCoursesOfStudent(String studentId);

    // Add Student To Course
    boolean addStudentToCourse(String studentId, String courseId);

}