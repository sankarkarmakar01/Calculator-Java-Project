package projects.Calculator.Optimal.SubClasses;

import projects.Calculator.Optimal.Interfaces.CalculatorOperation;

public class Subtraction implements CalculatorOperation {
    @Override
    public double calculate(double num1, double num2) throws ArithmeticException {
        return num1 - num2;
    }
}
