package core.view;

import java.util.Scanner;

public class ConsoleView implements View {
    private final Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public double promptForDouble(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Не валидное значение: ");
        }
        return scanner.nextDouble();
    }

    @Override
    public char promptForOperation() {
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation;
        while (true) {
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".indexOf(input.charAt(0)) != -1) {
                operation = input.charAt(0);
                break;
            } else {
                System.out.print("Не верная операция. Введите еще раз: ( +, -, *, /): ");
            }
        }
        return operation;
    }
}
