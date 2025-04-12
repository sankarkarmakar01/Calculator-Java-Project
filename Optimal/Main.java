package projects.Calculator.Optimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("=== Arithmetic Calculator ===");

        while (true) {
            System.out.print("Do you want to calculate? (Y/N): ");
            String choice = scanner.next();
            controller.calculate(choice);
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}