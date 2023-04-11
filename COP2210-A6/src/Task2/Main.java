  package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input any four lines");
        System.out.println("Enter line 1:");
        PoemMaker line1 = new PoemMaker(sc.nextLine());
        System.out.println("Enter line 2:");
        PoemMaker line2 = new PoemMaker(sc.nextLine());
        System.out.println("Enter line 3:");
        PoemMaker line3 = new PoemMaker(sc.nextLine());
        System.out.println("Enter line 4:");
        PoemMaker line4 = new PoemMaker(sc.nextLine());
        System.out.println();

        line1.poemize();
        line2.poemize();
        line3.poemize();
        line4.poemize();
        System.out.println("Total words in 4 lines: " +
                (line1.countWords() + line2.countWords() + line3.countWords() + line4.countWords()));
    }
}