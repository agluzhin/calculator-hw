package Core;

import Interfaces.Calculator;

public class BasicCalculator implements Calculator {
    public static double calculate(double firstOperand, double secondOperand, char operation) {
        double result;

        switch (operation) {
            case '+':
                result = Calculator.sum(firstOperand, secondOperand);
                break;
            case '-':
                result = Calculator.subtract(firstOperand, secondOperand);
                break;
            case '*':
                result = Calculator.multiply(firstOperand, secondOperand);
                break;
            case '/':
                result = Calculator.division(firstOperand, secondOperand);
                break;
            default:
                result = 0.0d;
                System.out.println("Ошибка! Неизвестная операция...");
        }

        return result;
    }
}
