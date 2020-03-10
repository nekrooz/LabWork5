package commandList;

import utils.Logger;
import utils.UserInterface;

public class Help extends Command {
    public Help(){
        super("help", "вывести справку по доступным командам");
    }

    public void execute(UserInterface ui, String[] args){
        CommandsManager commandsManager = new CommandsManager();

        commandsManager.getCommandList().forEach(com -> Logger.printl(com.getName(), ":", com.getHelp()));
    }
}
