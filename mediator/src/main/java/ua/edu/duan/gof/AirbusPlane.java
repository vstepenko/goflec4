package ua.edu.duan.gof;

public class AirbusPlane implements IAirCraft{

    private  Terminal terminal;

    @Override
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void sendMessage(String message) {
        if(terminal != null) {
            terminal.retranslateMessage("Airbus message: " + message);
        }
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Airbus receive: " + message);
    }
}
