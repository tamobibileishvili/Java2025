package Seminar1;

public class Rectangle {
    private double length;

    private double width;

    public Rectangle(double length, double width) {
        if(length <= 0 || width <= 0) {
            System.out.println("Invalid dimensions");
            return;
        }
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }
}
