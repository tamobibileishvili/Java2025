package Seminar1;

public class Product {
    private String productName;

    private double price;

    private double stockQuantity;

    public Product(String productName, double price, double stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(double stockQuantity) {
        if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity");
        } else {
            this.stockQuantity = stockQuantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("Invalid price");
        } else {
            this.price = price;
        }
    }

    public void restock(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        } else {
            this.stockQuantity += amount;
        }
    }

    public void sell(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        } else if(amount > this.stockQuantity) {
            System.out.println("Insufficient stock");
        }
        else {
            this.stockQuantity -= amount;
        }
    }
}
