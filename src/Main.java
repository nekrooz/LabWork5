import utils.JsonReader;
import utils.JsonWriter;
import utils.UserInteraction;

public class Main {
    public static void main(String[] args){
        JsonReader jsonReader = new JsonReader();
        JsonWriter jsonWriter = new JsonWriter();
        UserInteraction userInteraction = new UserInteraction();
        userInteraction.reader("кк");
        userInteraction.print("Введите команду");
        userInteraction.nextCommandInput();
    //    try {
     //       String path = Paths.get(args[0]).toAbsolutePath().toString();
     //       Collection col = jsonReader.readCollection(path);

      //      for(HumanBeing h : col.getCollection())
      //          System.out.println(h.id);
//            jsonWriter.writeCollection(col, path);
       // } catch (IOException e) {
       //     e.printStackTrace();
       // }
   // }
}
}
