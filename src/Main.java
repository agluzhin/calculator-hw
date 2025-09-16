import Core.BasicCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstOperand = 0.0d;
        double secondOperand;
        char selectedOperation;
        double calculationResult;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый операнд: ");
        while(true) {
            if (scanner.next().charAt(0) == 's') {
                System.out.println("Программа выключается.");
                break;
            } else if (firstOperand != 0.0d) {
                System.out.println("Введите второй операнд: ");
                secondOperand = scanner.nextDouble();
                System.out.println("Выберите операцию (+, -, *, /): ");
                selectedOperation = scanner.next().charAt(0);

                calculationResult = BasicCalculator.calculate(firstOperand, secondOperand, selectedOperation);
                System.out.println(calculationResult);
                firstOperand = calculationResult;
            } else {
                System.out.println("Введите первый операнд: ");
                firstOperand = scanner.nextDouble();
                System.out.println("Введите второй операнд: ");
                secondOperand = scanner.nextDouble();
                System.out.println("Выберите операцию (+, -, *, /): ");
                selectedOperation = scanner.next().charAt(0);

                calculationResult = BasicCalculator.calculate(firstOperand, secondOperand, selectedOperation);
                System.out.println(calculationResult);
                firstOperand = calculationResult;
            }
        }
    }
}