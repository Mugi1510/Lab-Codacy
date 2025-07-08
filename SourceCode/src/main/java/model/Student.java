package model;

public class Student {
    private int id;
    private String fullName;
    private double gpa;

    public Student(int id, String fullName, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.gpa = gpa;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        
    }

    public void setFullName(String fullName) {
        
    }

    public double getGpa() {
        
    }

    public void setGpa(double gpa) {
        
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, GPA: %.2f", id, fullName, gpa);
    }
}
