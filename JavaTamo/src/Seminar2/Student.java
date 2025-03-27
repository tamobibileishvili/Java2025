package Seminar2;

public class Student {
    private String name;
    private static final String collegeName = "UoN";

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
    }

    public static void displayCollege() {
        System.out.println("College Name is: " + collegeName);
    }

    public void studentName() {
        System.out.println("Student Name is: " + name);
    }
}
