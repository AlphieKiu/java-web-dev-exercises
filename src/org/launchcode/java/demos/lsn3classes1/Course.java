package org.launchcode.java.demos.lsn3classes1;


import java.util.ArrayList;

public class Course {

    private String courseName;
    private String instructor;
    private ArrayList<Student> studentList;

    public String getCourseName() {
        return courseName;
    }

    protected void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public String getInstructor() {
        return instructor;
    }

    protected void setInstructor(String aSetInstructor) {
        instructor = aSetInstructor;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    protected void setStudentList(ArrayList<Student> aStudentList) {
        studentList = aStudentList;
    }


}
