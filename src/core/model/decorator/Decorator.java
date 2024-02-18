package core.model.decorator;

import core.model.Calculator;

public abstract class Decorator implements Calculator {
    private Calculator calculator;

    protected Decorator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculator add(Calculator calc) {
        return calculator.add(calc);
    }

    public Calculator subtract(Calculator calc) {
        return calculator.subtract(calculator);
    }

    public Calculator multiply(Calculator calc) {
        return calculator.multiply(calculator);
    }

    public Calculator divide(Calculator calc) {
        return calculator.divide(calculator);
    }
}
