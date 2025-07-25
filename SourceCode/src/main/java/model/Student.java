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
        return fullName;
    }

    // ISSUE 1: No validation for empty or null fullName
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        
    }

    public double getGpa() {
        return gpa;
    }

    

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, GPA: %.2f", id, fullName, gpa);
    }

    // ISSUE 3: Missing equals() and hashCode() methods
    // This may cause issues when using Student objects in collections.
    // Consider overriding equals() and hashCode().
}
