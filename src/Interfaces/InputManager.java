package Interfaces;

import java.util.Scanner;

public interface InputManager {
    double getOperandInput(Scanner scanner, String prompt);
    char getOperationInput(Scanner scanner, String prompt);
}
