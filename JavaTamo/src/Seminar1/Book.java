package Seminar1;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Default Title";
        this.author = "Default Author";
        this.price = 10.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String displayInfo() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price;
    }
}
