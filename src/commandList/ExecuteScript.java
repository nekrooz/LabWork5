package commandList;

import utils.Logger;
import utils.UserInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExecuteScript extends Command {
    public ExecuteScript(){
        super("execute_script", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
    }

    public void execute(UserInterface ui, String[] args){
        try{
            if(args.length == 0)
                throw new IndexOutOfBoundsException("Please, specify path to file");
            String path = Paths.get(args[0]).toAbsolutePath().toString();

            File file = new File(path);
            Scanner sc = new Scanner(file);
//
//            while (sc.hasNextLine()){
//                String com = sc.nextLine();
//                ui.executeCommand();
//            }
//                System.out.println(sc.nextLine());
        }catch (IndexOutOfBoundsException | FileNotFoundException e){
            Logger.printl(e.getMessage());
        }
    }
}
