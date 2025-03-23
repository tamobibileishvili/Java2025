package Seminar1;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("John Doe", "1234567890");
        bankAccount.deposit(100);
        bankAccount.deposit(0);
        bankAccount.withdraw(-100);
        bankAccount.withdraw(-50);
        bankAccount.withdraw(200);

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
