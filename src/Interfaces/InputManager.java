package Interfaces;

import java.util.Scanner;

public interface InputManager {
    double getOperandInput(Scanner scanner, String message);
    char getOperationInput(Scanner scanner, String message);
}
