package Task1;

import java.util.Scanner;

public class Nums {
    int posCnt, negCnt, zeroCnt, oddCnt, evenCnt, size;
    String temp = "";
    Scanner sc = new Scanner(System.in);

    private int[] splitString(String s){
        int[] nums = new int[size];
        int i = 0;
        String chars = "";
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != ' ') {
                chars += s.charAt(j);
            } else {
                nums[i] = Integer.parseInt(chars);
                chars = "";
                i++;
            }
        }
        return nums;
    }
    private void countNums(int[] nums){
        for (int num : nums) {
            if (num > 0) {
                posCnt++;
            } else if (num < 0) {
                negCnt++;
            } else {
                zeroCnt++;
            }

            if (num % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        System.out.println("Positive numbers = " + posCnt);
        System.out.println("Negative numbers = " + negCnt);
        System.out.println("Odd numbers = " + oddCnt);
        System.out.println("Even numbers = " + evenCnt);
        System.out.println("Zeroes = " + zeroCnt);
    }
    public Nums() {
        System.out.println("Enter size of the Array:");
        size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter " + size + " values for the Array:");
        sc.nextLine(); /* sc.nextLine is used to consume the newline character left by sc.nextInt()
                          I had to do copious amounts of Stackoverflow research to find why it was skipping
                          temp = sc.nextLine, but I found it and was able to remedy it here. */
        temp = sc.nextLine();
        nums = splitString(temp);
        countNums(nums);
    }
}
