package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class OrderingSystem {
    static Scanner sc = new Scanner(System.in);
    static double totalQuantityOrdered;
    static Order[] orders;

    public static void computeTotalQuantity() { //Computes the total quantity ordered
        for(int i = 0; i < orders.length; i++) {
            totalQuantityOrdered += orders[i].getQuantity();
        }
    }
    public static void getData() { //Asks the user what they want
        System.out.println("*** Welcome to the Ordering System ***");
        System.out.println("Enter the number of items you want to order: ");
        int numItems = sc.nextInt();
        orders = new Order[numItems];
        for(int i = 0; i < orders.length; i++) {
            orders[i] = new Order();
            orders[i].readInput();
        }
    }
    public static void writeOutput() {
        System.out.println("*** Order Summary ***");
        computeTotalQuantity();
        System.out.println("The total quantity ordered is: " + totalQuantityOrdered);
        for(int i = 0; i < orders.length; i++) {
            System.out.println(orders[i].toString());
        }
    }
}
