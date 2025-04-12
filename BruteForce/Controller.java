package projects.Calculator.BruteForce;

import projects.Calculator.BruteForce.claculationClasses.*;

import java.util.Objects;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    Addition add = new Addition();
    Subtraction sub = new Subtraction();
    Multiplication mul = new Multiplication();
    Division div = new Division();
    ModuleDivision mod = new ModuleDivision();

    double num1, num2;
    String operator;

    public void calculate(String choice) throws Exception {
        if(Objects.equals(choice, "Y") || Objects.equals(choice, "y")) {
            System.out.println("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            num2 = scanner.nextDouble();
            System.out.println("Enter the operator: ");
            operator = scanner.next();

            double result;

           switch (operator){
               case "+":
                   result = add.addition(num1,num2);
                   System.out.println("The addition of " + num1 + " and " + num2 + " is: " + result);
                   break;
               case "-":
                   result = sub.subtraction(num1,num2);
                   System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + result);
                   break;
               case "*":
                   result = mul.multiplication(num1,num2);
                   System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + result);
                   break;
               case "/":
                   result = div.division(num1,num2);
                   System.out.println("The division of " + num1 + " and " + num2 + " is: " + result);
                   break;
               case "%":
                   result = mod.moduleDivision(num1,num2);
                   System.out.println("The module division of " + num1 + " and " + num2 + " is: " + result);
                   break;
               default:
                   throw new Exception("Please enter a valid operator!");
           }
        } else if(Objects.equals(choice, "N") || Objects.equals(choice, "n")) {
            System.out.println("Exit...");
            System.exit(0);
        } else {
            System.out.println("Invalid Input!!!");
        }
    }
}
