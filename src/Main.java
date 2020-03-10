import commandList.Privet;
import exceptions.CommandNotFoundException;
import utils.IO;
import utils.Logger;

public class Main {
    public static void main(String[] args){
//        try {
        try{
            Logger.randPrivet();
            IO io = new IO(args[0], args[1]);
            io.listen();
        }catch (Exception e){
            e.printStackTrace();
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
}
