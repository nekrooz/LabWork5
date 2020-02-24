package commands;

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

