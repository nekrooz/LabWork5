package utils;

import java.util.Scanner;

public class UserInteraction {
    private final Scanner in;

   public UserInteraction(){
   in = new Scanner(System.in);
   }


public void reader(String readName){
    System.out.println("Введите значение "+readName+": ");
    in.nextLine();
}
public void nextCommandInput(){
    System.out.println(":::");
    in.nextLine();
}

public void print(String string){
    System.out.println(string);
}
}