package com.courseserviceproject.courseservice;
import java.io.FileNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class API {

    @Autowired
    CourseFileService courseFileService;
    @Autowired
    CourseService courseService;
    @Autowired
    Course course;

    String filePath1 = "docs/students.txt";
    String filePath2 = "docs/courses.txt";

    // Test API Call
    @GetMapping("/test")
    public List<String> getTest(){
        return List.of("Teppo", "Erkki", "Olli");
    }

    // Get All Students
    @GetMapping("/students")
    public List<Student> readStudentsFromFile()throws FileNotFoundException {
    
        courseService.setStudents(courseFileService.readStudentsFromFile(filePath1));
        return courseService.getStudents();
    }

    // Get All Courses
    @GetMapping("/courses")
    public List<Course> readCoursesFromFile()throws FileNotFoundException {
        courseService.setCourses(courseFileService.readCoursesFromFile(filePath2));
        return courseService.getCourses();
    }

    // Get All Online Courses
    @GetMapping("/onlinecourses")
    public List<OnlineCourse> readOnlineCourses() throws FileNotFoundException {
        return courseFileService.readOnlineCoursesFromFile(filePath2);
    }

    // Get All Info From A Student By ID
    @GetMapping("/students/{studentId}")
    public Student getStudentID(@PathVariable String studentId){
        return courseService.getStudentByID(studentId);
    }

    // Get Course Name + Registered Students
    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){
        return courseService.getCourseByID(courseId);
    }

    // // Add Student To Course
    @PostMapping("/add")
    public boolean addStudent(@RequestBody String studentId, String courseId){
        return courseService.addStudentToCourse(studentId, courseId);
    }

    @GetMapping("/registered")
    public List<Student> getStudents() throws FileNotFoundException {
        return course.getStudents();
    }

}