package ua.edu.duan.gof;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.executeCommand(new AddCommand(50)));
        System.out.println(calculator.executeCommand(new MultiplyCommand(2)));
        System.out.println(calculator.executeCommand(new DivCommand(2)));
        System.out.println(calculator.executeCommand(new SubtractCommand(10)));

        System.out.println(calculator.undo());
        System.out.println(calculator.undo());
        System.out.println(calculator.undo());
        System.out.println(calculator.undo());

    }
}
