package projects.Calculator.BruteForce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println(".....Arithmetical calculator.....");

        System.out.println("Do you want to calculate? (Y/y or N/n) : ");
        String choice = scanner.next();
        controller.calculate(choice);

        while(true) {
            System.out.println("Do you want to continue?..... (Y/y or N/n) : ");
            choice = scanner.next();
            controller.calculate(choice);
        }
    }
}