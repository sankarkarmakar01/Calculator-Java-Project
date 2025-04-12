package projects.Calculator.BruteForce.claculationClasses;

import projects.Calculator.BruteForce.interfaces.MultiplicationInterface;

public class Multiplication implements MultiplicationInterface {
    @Override
    public double multiplication(double num1, double num2) {
        try {
            if(num1 == 0 && num2 == 0) {
                return 0;
            } else {
                return num1 * num2;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}