package ua.edu.duan.gof;

public class AddCommand implements ICommand{

    private double value;

    public AddCommand(double value) {
        this.value = value;
    }

    @Override
    public double execute(double currentValue) {
        return currentValue + value;
    }

    @Override
    public double undo(double currentValue) {
        return value - currentValue;
    }
}
