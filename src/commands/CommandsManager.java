package commands;

import comps.HumanBeing;

import java.util.ArrayList;

public class CommandsManager {
    private ArrayList <Command> commands;

    public CommandsManager(){
        commands = new ArrayList<>();

        commands.add(new Add());
        commands.add(new Help());
        commands.add(new Show());
        commands.add(new Save());
    }

    public ArrayList <Command> getCommands(){
        return commands;
    }
}
