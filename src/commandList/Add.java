package commandList;

import utils.UserInterface;

public class Add extends Command {

    public Add(){
        super("add", "добавить новый элемент в коллекцию");
    }

    public void execute(UserInterface ui, String[] args){
        System.out.println("ADD" + String.join(", ", args));
    }

}
