package commands;

import utils.UserInterface;

public class Help extends Command {
    public Help(){
        super("help", "вывести справку по доступным командам");
    }

    public void execute(UserInterface ui, String[] args){
        CommandsManager commandsManager = new CommandsManager();

        for(CommandInterface com : commandsManager.getCommands())
            ui.print(com.getName(), ":", com.getHelp());
    }
}
