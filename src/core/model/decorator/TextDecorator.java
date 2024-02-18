package core.model.decorator;

import core.model.Calculator;

public class TextDecorator extends Decorator {

    public TextDecorator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public Calculator add(Calculator other) {
        System.out.println("Операция Сложения");
        return super.add(other);
    }

    @Override
    public Calculator subtract(Calculator other) {
        System.out.println("Операция Вычитания");
        return super.subtract(other);
    }

    @Override
    public Calculator multiply(Calculator other) {
        System.out.println("Операция Умножения");
        return super.multiply(other);
    }

    @Override
    public Calculator divide(Calculator other) {
        System.out.println("Операция Деления");
        return super.divide(other);
    }
}
