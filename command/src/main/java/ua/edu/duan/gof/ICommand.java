package ua.edu.duan.gof;

public interface ICommand {
    double execute(double value);

    double undo(double value);
}
