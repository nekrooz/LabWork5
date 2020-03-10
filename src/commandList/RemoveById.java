package commandList;

import utils.UserInterface;

public class RemoveById extends Command {
    public RemoveById(){
        super("remove_by_id", "удалить элемент из коллекции по его id");
    }

    public void execute(UserInterface ui, String[] args){
        int id = Integer.parseInt(args[0]);
        ui.getCollection().removeById(id);
    }
}
