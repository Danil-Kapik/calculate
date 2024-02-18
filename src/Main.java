
import core.controller.controller.CalculatorController;
import core.view.ConsoleView;
import core.view.View;


public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();
        CalculatorController controller = new CalculatorController(view);
        controller.startCalculator();
    }
}