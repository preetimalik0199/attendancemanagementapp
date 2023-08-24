package com.example.myapplication.model;

public class MyCourseModel {

    private String courseId,courseName,type;

    public MyCourseModel(String courseId, String courseName, String type) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.type = type;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
