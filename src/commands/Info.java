package commands;

import collection.StoreService;
import utils.UserInteraction;

public class Info extends AbstractComand {
    public Info(){
        command = "info";
        textInfo = "Информация о коллекции в стандартном потоке";
    }
    @Override
    public void execute(UserInteraction userInteraction, StoreService storeService, String[] args) {

    }
}
