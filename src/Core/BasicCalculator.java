package Core;

import Interfaces.Calculator;

public class BasicCalculator implements Calculator {
    public static double calculate(double firstOperand, double secondOperand, char operation) {
        return switch (operation) {
            case '+' -> Calculator.sum(firstOperand, secondOperand);
            case '-' -> Calculator.subtract(firstOperand, secondOperand);
            case '*' -> Calculator.multiply(firstOperand, secondOperand);
            case '/' -> Calculator.division(firstOperand, secondOperand);
            default -> 0.0d;
        };
    }
}
