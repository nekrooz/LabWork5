package commandList;

import utils.UserInterface;

public class Clear extends Command {
    public Clear(){
        super("clear", "очистить коллекцию");
    }

    public void execute(UserInterface ui, String[] args){
        ui.getCollection().clear();
    }
}
