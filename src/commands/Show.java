package commands;
import comps.HumanBeing;
import utils.UserInterface;

public class Show extends Command {
    public Show(){
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    public void execute(UserInterface ui, String[] args){
        for(Object hb : ui.getCollection().asArray())
            ui.print(hb.toString(), "\n");
=======
import collection.StoreService;
import utils.UserInteraction;

public class Show extends AbstractComand {
    public Show(){
        command = "Show";
        textInfo = "Вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
    @Override
    public void execute(UserInteraction userInteraction, StoreService storeService, String[] args) {
    }
}
