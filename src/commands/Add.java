package commands;

import collection.StoreService;
import comps.HumanBeing;
import utils.UserInteraction;

import java.lang.reflect.Executable;

public class Add extends AbstractComand {
    UserInteraction userInteraction = new UserInteraction();
    public Add(){
        command = "add";
        textInfo = "Добавление нового элемента в коллекцию. Принимает один аргумент";
    }

    public UserInteraction getUserInteraction() {
        return userInteraction;
    }
    @Override
    public void execute(UserInteraction userInteraction, StoreService storeService, String[] args) {
    }
}
