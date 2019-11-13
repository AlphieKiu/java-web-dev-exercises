package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private String gradeLevel = getGradeLevel();

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }


    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
         if (numberOfCredits < 30) {
            return this.gradeLevel = "Freshman";
         } else if (numberOfCredits < 60) {
             return this.gradeLevel = "Sophomore";
         } else if (numberOfCredits < 90) {
             return this.gradeLevel = "Junior";
         } else {
             return this.gradeLevel = "Senior";
         }

    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double qualityScore = this.gpa* this.numberOfCredits;
        double newQualityScore = qualityScore+(courseCredits*grade);
        this.numberOfCredits = this.numberOfCredits+courseCredits;
        this.gpa = newQualityScore/(this.numberOfCredits);
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return  name+" (Student Id: " + studentId + ", Credits: " + numberOfCredits + ", GPA: " + gpa + ", Grade Level: " + gradeLevel + ')';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != getClass()){
            return false;
        }
        Student student = (Student) o;
        //unsure of line 84-88
        return studentId == student.studentId &&
                numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(gradeLevel, student.gradeLevel);
    }


    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);

    }
}
