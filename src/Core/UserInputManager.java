package Core;

import Interfaces.InputManager;

import java.util.Scanner;

public class UserInputManager implements InputManager {
    @Override
    public double getOperandInput(Scanner scanner, String message) {
        while(true) {
            System.out.println(message);
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException ignore) {
                System.out.println("\nОшибка формата: некорректный ввод операнда (должно быть число).\nПопробуйте еще раз.\n");
            }
        }
    }

    @Override
    public char getOperationInput(Scanner scanner, String message) {
        while(true) {
            System.out.println(message);
            try {
                char operation = scanner.next().charAt(0);
                if("+-*/".contains(String.valueOf(operation))) {
                    return operation;
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException ignore) {
                System.out.println("\nОшибка формата: некорректный ввод операции (должен быть любой символ: +, -, *, /).\nПопробуйте еще раз.\n");
            }
        }
    }
}
