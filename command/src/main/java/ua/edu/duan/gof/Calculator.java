package ua.edu.duan.gof;

import java.util.Stack;

public class Calculator {

    private double currentValue = 0;

    private final Stack<ICommand> stack = new Stack<>();

    public double executeCommand(ICommand command){
        currentValue = command.execute(currentValue);
        stack.add(command);
        return currentValue;
    }

    public double undo(){
        ICommand command  = stack.pop();
        currentValue = command.undo(currentValue);
        return currentValue;
    }

    public Stack<ICommand> getStack() {
        return stack;
    }
}
