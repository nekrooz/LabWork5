package commandList;

import collection.Collection;
import utils.Logger;
import utils.UserInterface;

public class Info extends Command {
    public Info(){
        super("info", "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
    }

    public void execute(UserInterface ui, String[] args){
        Collection c = ui.getCollection();
        Logger.printl("Collection type:", c.getType(), "\nCreation date:", c.getCreationDate(), "\nSize:", c.getSize());
    }
}
