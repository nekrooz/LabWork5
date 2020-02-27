package commands;
import utils.UserInterface;

import java.io.IOException;

public class Save extends Command {
    public Save(){
        super("save", "сохранить коллекцию в файл");
    }

    public void execute(UserInterface ui, String[] args) {
        try{
            ui.saveCollection();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
=======
import collection.StoreService;
import utils.UserInteraction;

public class Save extends AbstractComand {
    public Save(){
        command = "Save";
        textInfo = "Сохранить коллекцию в файл";
    }

    @Override
    public void execute(UserInteraction userInteraction, StoreService storeService, String[] args) {

    }
}
