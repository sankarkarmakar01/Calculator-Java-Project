package projects.Calculator.Optimal.Interfaces;

@FunctionalInterface
public interface CalculatorOperation {
    double calculate(double num1, double num2) throws ArithmeticException;
}
