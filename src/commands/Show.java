package commands;

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