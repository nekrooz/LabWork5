package utils;

import collection.Collection;
import commandList.CommandsManager;

import java.io.IOException;
import java.nio.file.Paths;

public class UserInterface {

    JsonReader jsonReader = new JsonReader();
    JsonWriter jsonWriter = new JsonWriter();

    private String inputPath;
    private String outputPath;

    Collection collection;

    private CommandsManager commandsManager = new CommandsManager();

    public UserInterface(String inputPath, String outputPath) {

        this.inputPath = Paths.get(inputPath).toAbsolutePath().toString();
        this.outputPath = Paths.get(outputPath).toAbsolutePath().toString();

        try {
            collection = jsonReader.readCollection(this.inputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveCollection() throws IOException {
        jsonWriter.writeCollection(outputPath, getCollection());
    }

    public Collection getCollection(){
        return collection;
    }

    public void executeCommand(String name, String[] args){
        commandsManager.executeCommand(name, this, args);
    }

}
