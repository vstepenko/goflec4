package ua.edu.duan.gof;

public class SubtractCommand implements ICommand{

    private final double subtractValue;

    public SubtractCommand(double value) {
        this.subtractValue = value;
    }

    @Override
    public double execute(double value) {
        return value - subtractValue;
    }

    @Override
    public double undo(double value) {
        return value + subtractValue;
    }
}
