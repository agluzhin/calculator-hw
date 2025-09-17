package Core;

import Interfaces.InputManager;

import java.util.Scanner;

public class UserInputManager implements InputManager {
    @Override
    public double getOperandInput(Scanner scanner, String prompt) {
        while(true) {
            System.out.println(prompt);
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException ignore) {
                System.out.println("\nОшибка: некорректный ввод операнда. Должно быть число.\nПопробуйте еще раз.\n");
            }
        }
    }

    @Override
    public char getOperationInput(Scanner scanner, String prompt) {
        while(true) {
            System.out.println(prompt);
            try {
                char operation = scanner.next().charAt(0);
                if("+-*/".contains(String.valueOf(operation))) {
                    return operation;
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException ignore) {
                System.out.println("\nОшибка: некорректный ввод операции. Операция должна быть одной из перечисленных ранее.\nПопробуйте еще раз.\n");
            }
        }
    }
}
