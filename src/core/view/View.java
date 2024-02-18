package core.view;

public interface View {
    void displayMessage(String message);
    double promptForDouble(String message);
    char promptForOperation();
}
