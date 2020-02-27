package commands;
import utils.UserInterface;

public class Clear extends Command {
    public Clear(){
        super("clear", "очистить коллекцию");
    }

    public void execute(UserInterface ui, String[] args){
=======
import collection.StoreService;
import utils.UserInteraction;

public class Clear extends AbstractComand{
    public Clear() {
        command = "clear";
        textInfo = "Очистить коллекцию";
    }


    @Override
    public void execute(UserInteraction userInteraction, StoreService storeService, String[] args) {
    }
}
