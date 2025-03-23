package Seminar1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
