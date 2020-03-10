package commandList;

import utils.Logger;
import utils.UserInterface;

public class Show extends Command {
    public Show(){
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    public void execute(UserInterface ui, String[] args){
        if(ui.getCollection().getSize() == 0){
            Logger.printl("Collection is empty");
            return;
        }
        for(Object hb : ui.getCollection().asArray())
            Logger.printl(hb.toString());
    }
}
