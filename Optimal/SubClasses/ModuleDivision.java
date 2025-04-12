package projects.Calculator.Optimal.SubClasses;

import projects.Calculator.Optimal.Interfaces.CalculatorOperation;

public class ModuleDivision implements CalculatorOperation {
    @Override
    public double calculate(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Division By Zero");
        }
        return num1 % num2;
    }
}
