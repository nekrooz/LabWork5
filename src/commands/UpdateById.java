package commands;

import collection.StoreService;
import utils.UserInteraction;

public class UpdateById extends AbstractComand {
    UpdateById(){
        command ="Update";
        textInfo="Обновить значение элемента коллекции, айди которого равен заданному";
    }
    @Override
    public void execute(UserInteraction userInteraction, StoreService storeService, String[] args) {

    }
}
