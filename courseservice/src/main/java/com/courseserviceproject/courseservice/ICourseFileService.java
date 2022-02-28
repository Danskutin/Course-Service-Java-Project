package com.courseserviceproject.courseservice;
import java.io.FileNotFoundException;
import java.util.List;

public interface ICourseFileService  {

    // Reads List of Students from students.txt File
    List<Student> readStudentsFromFile(String filePath1) throws FileNotFoundException;

    // Reads List of Courses from courses.txt File
    List<Course> readCoursesFromFile(String filePath2) throws FileNotFoundException;

    // Reads List of Online Courses from courses.txt File
    List<OnlineCourse> readOnlineCoursesFromFile(String filePath2) throws FileNotFoundException;
}