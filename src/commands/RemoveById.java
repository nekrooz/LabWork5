package commands;

import collection.StoreService;
import utils.UserInteraction;

public class RemoveById extends AbstractComand {
    public RemoveById() {
        command = "Remove";
        textInfo = "Удалить элемент из коллекции по его id";
    }

    @Override
    public void execute(UserInteraction userInteraction, StoreService storeService, String[] args) {

    }
}
