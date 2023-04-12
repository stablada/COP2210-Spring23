package Task2;

import java.util.Scanner;

public class Order {
    static Scanner sc = new Scanner(System.in);
    private static String productName;
    private static int quantity;

    public Order() {
        productName = "";
        quantity = 0;
    }
    public Order(String productName) {
        this.productName = productName;
        quantity = 0;
    }
    public Order(int quantity) {
        productName = "";
        this.quantity = quantity;
    }
    public Order(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public void set(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void readInput() {
        System.out.println("Enter Product's Name: ");
        productName = sc.nextLine();
        System.out.println("Enter Quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
    }
    public String toString() {
        if(quantity == 1) {
            return quantity + " " + productName + " is ordered.";
        }
        return quantity + " " + productName + "s are ordered.";
    }
}
