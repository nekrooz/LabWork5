import collection.Collection;
import comps.HumanBeing;
import utils.JsonReader;
import utils.JsonWriter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){
        JsonReader jsonReader = new JsonReader();
        JsonWriter jsonWriter = new JsonWriter();
        try {
            String inputPath = Paths.get(args[0]).toAbsolutePath().toString();
            String outputPath = Paths.get(args[1]).toAbsolutePath().toString();
            Collection col = jsonReader.readCollection(inputPath);

            for(HumanBeing h : col.getCollection())
                System.out.println(h.id);

            jsonWriter.writeCollection(col, outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
