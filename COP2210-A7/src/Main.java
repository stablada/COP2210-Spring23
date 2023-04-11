import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Employees:");
        int numEmployees = sc.nextInt();
        double[] salary = new double[numEmployees];
        double[] bonusSalary = new double[numEmployees];

        for(int i = 0; i < numEmployees; i++){
            System.out.println("Enter Employee " + (i + 1) + " salary:");
            salary[i] = sc.nextDouble();
        }
        System.out.println("Enter the bonus percentage:");
        double bonus = sc.nextDouble();

        bonusSalary = ArrayClass.addBonus(salary, bonus);
        for(int i = 0; i < numEmployees; i++){
            System.out.println("Employee " + (i+1) + ": Old Salary = $" + salary[i] + ", New Salary = $" + bonusSalary[i]);
        }
    }
}