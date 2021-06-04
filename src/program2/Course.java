package program2;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int numberOfStudents;
    private ArrayList<String>students= new ArrayList<String>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Programming Exercise 10.9
    }
}