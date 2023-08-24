package com.example.myapplication.model;

public class MyFacultyModel {
    private String facultycrsid, facultycrsname, facultyname;

    public MyFacultyModel(String facultycrsid, String facultycrsname, String facultyname) {
        this.facultycrsid = facultycrsid;
        this.facultycrsname = facultycrsname;
        this.facultyname = facultyname;
    }

    public String getFacultycrsid() {
        return facultycrsid;
    }

    public void setFacultycrsid(String facultycrsid) {
        this.facultycrsid = facultycrsid;
    }

    public String getFacultycrsname() {
        return facultycrsname;
    }

    public void setFacultycrsname(String facultycrsname) {
        this.facultycrsname = facultycrsname;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }
}