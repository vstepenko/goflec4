package ua.edu.duan.gof;

import java.util.ArrayList;
import java.util.List;

public class TerminalImpl implements  Terminal{

    private List<IAirCraft> airCraftList = new ArrayList<>();

    @Override
    public void registerAirCraft(IAirCraft airCraft) {
        airCraftList.add(airCraft);
        airCraft.setTerminal(this);

    }

    @Override
    public void retranslateMessage(String massage) {
        for (IAirCraft airCraft:airCraftList) {
            airCraft.receiveMessage(massage);
        }
    }
}
