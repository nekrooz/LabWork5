package commands;

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
