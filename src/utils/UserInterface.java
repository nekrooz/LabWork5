package utils;

import collection.Collection;
import commands.Command;
import exceptions.CommandNotFoundException;
import commands.CommandsManager;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;

public class UserInterface {

    JsonReader jsonReader = new JsonReader();
    JsonWriter jsonWriter = new JsonWriter();

    private String inputPath;
    private String outputPath;

    Collection collection;

    private HashMap<String, Command> commandList;

    public UserInterface(String inputPath, String outputPath) {
        commandList = new HashMap<>();

        this.inputPath = Paths.get(inputPath).toAbsolutePath().toString();
        this.outputPath = Paths.get(outputPath).toAbsolutePath().toString();

        try {
            collection = jsonReader.readCollection(this.inputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CommandsManager commandsManager = new CommandsManager();

        for (Command com : commandsManager.getCommands())
            commandList.put(com.getName(), com);

        for(String com : commandList.keySet())
            print("CommandList loaded", com);
    }

//    IO Commands
    public void print(String ...strings){
        System.out.println(String.join(" ", strings));
    }

    // TODO: Put findCommand and etc to CommandsManager or not...
    public Command findCommand(String name) throws CommandNotFoundException{
        try{
            if(!commandList.containsKey(name))
                throw new CommandNotFoundException("Command " + name + " not found");
            return commandList.get(name);
        }catch(CommandNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void saveCollection() throws IOException {
        try{
            jsonWriter.writeCollection(outputPath, getCollection());
        }catch (IOException e){
            throw e;
        }
    }

    public Collection getCollection(){
        return collection;
    }
}
