package ua.edu.duan.gof;

public interface IAirCraft {

    void setTerminal(Terminal terminal);
    void sendMessage(String message );
    void receiveMessage(String message);
}
