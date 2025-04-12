package projects.Calculator.BruteForce.claculationClasses;

import projects.Calculator.BruteForce.interfaces.DivisionInterface;

public class Division implements DivisionInterface {
    @Override
    public double division(double num1, double num2) throws Exception {
       try {
           if(num1 == 0) {
               return 0;
           } else if (num2 == 0) {
               throw new Exception("Not Possible");
           } else {
               return num1 / num2;
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }
}
