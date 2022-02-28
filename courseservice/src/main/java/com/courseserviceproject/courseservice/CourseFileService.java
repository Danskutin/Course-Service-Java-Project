package com.courseserviceproject.courseservice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service
public class CourseFileService implements ICourseFileService{
    
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();
    public List<OnlineCourse> onlineCourses = new ArrayList<>();

    String filePath1 = "docs/students.txt";
    String filePath2 = "docs/courses.txt";

    // Read and Return Students From students.txt File
    @Override
    public List<Student> readStudentsFromFile(String filePath1) throws FileNotFoundException { 
        
        FileInputStream fis = new FileInputStream(filePath1);
        Scanner sc = new Scanner(fis); 
        students.clear();

        while(sc.hasNext()) {
            String record = sc.nextLine();
            Scanner sc2 = new Scanner(record);
            sc2.useDelimiter("---");
            String studentFirstName,studentLastName;
            studentFirstName=sc2.next();
            studentLastName=sc2.next();

            sc2.close();
            Student s = new Student(studentFirstName, studentLastName);
            students.add(s);
        }
      
        sc.close();
        return students;
    }

    // Read and Return Courses From courses.txt File
    @Override
    public List<Course> readCoursesFromFile(String filePath2) throws FileNotFoundException {
        
        FileInputStream fis = new FileInputStream(filePath2);
        Scanner sc = new Scanner(fis); 
        courses.clear();

        while(sc.hasNext()) {
            String record = sc.nextLine();
            Scanner sc2 = new Scanner(record);
            sc2.useDelimiter("---");
            String courseName, teacherName, classRoom;
            Boolean onlineCourse = false;
            courseName=sc2.next();
            teacherName=sc2.next();
            classRoom=sc2.next();

            sc2.close();
            Course c = new Course(courseName, teacherName, classRoom, onlineCourse);
            courses.add(c);
        }
        
        sc.close();
        return courses;
    }

    // Read and Return Online Courses From courses.txt File
    @Override
    public List<OnlineCourse> readOnlineCoursesFromFile(String filePath2) throws FileNotFoundException {
        
        FileInputStream fis = new FileInputStream(filePath2);
        Scanner sc = new Scanner(fis); 
        onlineCourses.clear();

        while(sc.hasNext()) {
            String record = sc.nextLine();
            Scanner sc2 = new Scanner(record);
            sc2.useDelimiter("---");
            String courseURL, teacherName, courseName;
            Boolean onlineCourse = null;
            
            courseName=sc2.next();
            teacherName=sc2.next();
            courseURL=sc2.next();
            onlineCourse=Boolean.parseBoolean(sc2.next());
            
            if(onlineCourse == true) {
                sc2.close();
                OnlineCourse oc = new OnlineCourse(courseURL, teacherName, courseName);
                onlineCourses.add(oc);
            }
            
        }
        
        sc.close();
        return onlineCourses;
    }
}