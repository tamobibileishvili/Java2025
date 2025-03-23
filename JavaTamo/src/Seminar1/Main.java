package Seminar1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle rectangle1 = new Rectangle(10, 20);

        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());


        Book book1 = new Book();
        Book book2 = new Book("Lord of rings", "Title", 15.99);

        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());

        Circle circle = new Circle(5);

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Circumference of circle: " + circle.calculateCircumference());
    }
}
