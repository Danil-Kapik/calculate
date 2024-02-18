package core.controller.controller;

import core.model.ComplexCalculator;
import core.model.Number;
import core.view.View;

public class CalculatorController {
    private final View view;

    public CalculatorController(View view) {
        this.view = view;
    }

    public void startCalculator() {
        view.displayMessage("Добро пожаловать в Калькулятор!");
        double realPart1 = view.promptForDouble("Введите действительную часть первого комплексного числа: ");
        double imaginaryPart1 = view.promptForDouble("Введите мнимую часть первого комплексного числа: ");
        double realPart2 = view.promptForDouble("Введите действительную часть второго комплексного числа: ");
        double imaginaryPart2 = view.promptForDouble("Введите мнимую часть второго комплексного числа: ");

        ComplexCalculator num1 = new ComplexCalculator(realPart1, imaginaryPart1);
        ComplexCalculator num2 = new ComplexCalculator(realPart2, imaginaryPart2);

        char operation = view.promptForOperation();

        Number result;
        switch (operation) {
            case '+':
                result = num1.add(num2);
                break;
            case '-':
                result = num1.subtract(num2);
                break;
            case '*':
                result = num1.multiply(num2);
                break;
            case '/':
                result = num1.divide(num2);
                break;
            default:
                view.displayMessage("Не верная операция.");
                return;
        }

        if (result instanceof ComplexCalculator complexResult) {
            if (complexResult.getRealPart() != 0 && complexResult.getImaginaryPart() != 0) {
                view.displayMessage("Результат: " + complexResult.getRealPart() + " + " + complexResult.getImaginaryPart() + "i");
            }
            if (complexResult.getRealPart() == 0 && complexResult.getImaginaryPart() != 0) {
                view.displayMessage("Результат: " + complexResult.getImaginaryPart() + "i");
            }
            if (complexResult.getImaginaryPart() == 0 && complexResult.getRealPart() != 0) {
                view.displayMessage("Результат: " + complexResult.getRealPart());
            }
            if (complexResult.getRealPart() == 0 && complexResult.getImaginaryPart() == 0) {
                view.displayMessage("Результат: 0");
            }
        } else {
            view.displayMessage("Результат: " + result);
        }

    }
}

