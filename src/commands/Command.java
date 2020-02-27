package commands;

import utils.UserInterface;

interface CommandInterface{
    void execute(UserInterface ui, String[] args);
    String getName();
    String getHelp();
}

public abstract class Command implements CommandInterface{
    protected final String name;
    protected final String help;

    public Command(String name, String help){
        this.name = name;
        this.help = help;
    }

    public String getName(){
        return name;
    }

    public String getHelp(){
        return help;
    }
}