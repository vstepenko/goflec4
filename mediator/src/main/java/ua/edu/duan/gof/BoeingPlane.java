package ua.edu.duan.gof;

public class BoeingPlane implements  IAirCraft{
    private  Terminal terminal;

    @Override
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void sendMessage(String message) {
        terminal.retranslateMessage("Boeing message: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println( "Boeing receive: " + message);
    }
}
