
import exceptions.CommandNotFoundException;
import utils.IO;

public class Main {
    public static void main(String[] args){
//        try {
        try{
            IO io = new IO(args[0], args[1]);
            io.listen();
        }catch (CommandNotFoundException e){
            System.out.println(e.getMessage());
        }


////            Collection col = jsonReader.readCollection(inputPath);
////
////            for(HumanBeing h : col.getCollection())
////                System.out.println(h.toString());
//
//            Collection col = new Collection();
//            HumanBeing h = new HumanBeing(
//                    1,
//                    "Human",
//                    new Coordinates(5, 10),
//                    LocalDateTime.now(),
//                    true,
//                    false,
//                    10.0f,
//                    "Again.wav",
//                    69.42f,
//                    Mood.SADNESS,
//                    new Car("MY CAR, BITCH")
//            );
//            col.add(h);
//
//            jsonWriter.writeCollection(col, outputPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
=======
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
