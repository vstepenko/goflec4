package ua.edu.duan.gof;

public class MediatorTest {
    public static void main(String[] args) {
        IAirCraft boeing1 = new BoeingPlane();
        IAirCraft boeing2= new BoeingPlane();
        IAirCraft airbus1 = new AirbusPlane();


        Terminal terminal = new TerminalImpl();

        terminal.registerAirCraft(boeing1);
        terminal.registerAirCraft(boeing2);
        terminal.registerAirCraft(airbus1);


        boeing1.sendMessage(" my coordinates 1 1");
        airbus1.sendMessage(" my coordinates 2 2");
    }
}
