import Core.BasicCalculator;
import Core.UserInputManager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double calculationResult = 0.0d;

        UserInputManager userInputManager = new UserInputManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Список команд:\np - (от 'proceed') продолжить вычисления\nc - сброс/запуск калькулятора\ns - выключение калькулятора\n");
            String userInput = scanner.next();

            if (userInput.charAt(0) == 's') {
                System.out.println("\n=== Выключение калькулятора ===\n");
                break;
            } else if (userInput.charAt(0) == 'c') {
                System.out.println("\n=== Запуск калькулятора ===\n");
                calculationResult = getFirstCalculation(userInputManager, scanner);
                System.out.println("\n" + calculationResult + "\n");
            } else if (userInput.charAt(0) == 'p' && calculationResult != 0.0d) {
                calculationResult = getAdditionalCalculation(userInputManager, scanner, calculationResult);
                System.out.println("\n" + calculationResult + "\n");
            } else {
                System.out.println("Ошибка: некорректный ввод команды. Команда должна быть одной из вышеперечисленных.");
            }

        }
        scanner.close();
    }

    public static double getFirstCalculation(UserInputManager userInputManager, Scanner scanner) {
        double firstOperand = userInputManager.getOperandInput(scanner, "Введите первый операнд: ");
        double secondOperand = userInputManager.getOperandInput(scanner, "Введите второй операнд: ");
        char selectedOperation = userInputManager.getOperationInput(scanner, "Выберите операцию (+, -, *, /): ");

        return BasicCalculator.calculate(firstOperand, secondOperand, selectedOperation);
    }

    public static double getAdditionalCalculation(UserInputManager userInputManager, Scanner scanner, double calculationResult) {
        double secondOperand = userInputManager.getOperandInput(scanner, "Введите второй операнд: ");
        char selectedOperation = userInputManager.getOperationInput(scanner, "Выберите операцию (+, -, *, /): ");

        return BasicCalculator.calculate(calculationResult, secondOperand, selectedOperation);
    }
}