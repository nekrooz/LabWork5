package commandList;

import utils.Logger;
import utils.UserInterface;

import java.util.ArrayList;

public class Privet extends Command {

    public Privet(){
        super("privet", "Ochevidno zhe");
    }

    public void execute(UserInterface ui, String[] args){
        Logger.randPrivet();
    }
}
