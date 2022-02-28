package com.courseserviceproject.courseservice;

public class OnlineCourse{
    
    private String courseURL;
    private String teacherName;
    private String courseName;

    public OnlineCourse(String courseURL, String teacherName, String courseName)
    {
        super();
        this.courseURL = courseURL;
        this.teacherName = teacherName;
        this.courseName = courseName;
        
    }

    // Get Online Course Name
    public String getCourseName(){
        return this.courseName;
    }

    // Set Course URL
    public void setCourseUrl(String CourseUrl){
        this.courseURL = courseURL;
    }

}
