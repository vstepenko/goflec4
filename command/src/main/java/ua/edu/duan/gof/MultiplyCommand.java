package ua.edu.duan.gof;

public class MultiplyCommand implements ICommand{

    private final double multipleValue;

    public MultiplyCommand(double multipleValue) {
        this.multipleValue = multipleValue;
    }

    @Override
    public double execute(double value) {
        return value * multipleValue;
    }

    @Override
    public double undo(double value) {
        return value / multipleValue;
    }
}
