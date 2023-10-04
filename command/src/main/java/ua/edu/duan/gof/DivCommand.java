package ua.edu.duan.gof;

public class DivCommand implements  ICommand{

    private final double divValue;

    public DivCommand(double divValue) {
        this.divValue = divValue;
    }

    @Override
    public double execute(double value) {
        return value / divValue;
    }

    @Override
    public double undo(double value) {
        return value * divValue;
    }
}
