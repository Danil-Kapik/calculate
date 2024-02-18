package core.model;

public class ComplexCalculator implements ComplexNumber, Calculator {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexCalculator(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public Calculator add(Calculator other) {
        ComplexCalculator complexOther = (ComplexCalculator)other;
        return new ComplexCalculator(this.realPart + complexOther.realPart,
                this.imaginaryPart + complexOther.imaginaryPart);
    }

    @Override
    public Calculator subtract(Calculator other) {
        ComplexCalculator complexOther = (ComplexCalculator) other;
        return new ComplexCalculator(this.realPart - complexOther.realPart,
                this.imaginaryPart - complexOther.imaginaryPart);
    }

    @Override
    public Calculator multiply(Calculator other) {
        ComplexCalculator complexOther = (ComplexCalculator) other;
        double newReal = this.realPart * complexOther.realPart - this.imaginaryPart * complexOther.imaginaryPart;
        double newImaginary = this.realPart * complexOther.imaginaryPart + this.imaginaryPart * complexOther.realPart;
        return new ComplexCalculator(newReal, newImaginary);
    }

    @Override
    public Calculator divide(Calculator other) {
        ComplexCalculator complexOther = (ComplexCalculator) other;
        double denominator = complexOther.realPart * complexOther.realPart + complexOther.imaginaryPart * complexOther.imaginaryPart;
        double newReal = (this.realPart * complexOther.realPart + this.imaginaryPart * complexOther.imaginaryPart) / denominator;
        double newImaginary = (this.imaginaryPart * complexOther.realPart - this.realPart * complexOther.imaginaryPart) / denominator;
        return new ComplexCalculator(newReal, newImaginary);
    }
}