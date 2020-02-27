package utils;

import exceptions.CommandNotFoundException;
import commands.Add;

import java.util.Arrays;
import java.util.Scanner;

public class IO {
    private Scanner scanner;
    private UserInterface ui;

    public IO(String inputPath, String outputPath) {
        scanner = new Scanner(System.in);
        ui = new UserInterface(inputPath, outputPath);
    }

    public void listen() throws CommandNotFoundException{
        String command;
        String[] args;

        do{
            String[] argv = scanner.nextLine().split(" ");
            command = argv[0];
            args = Arrays.copyOfRange(argv, 1, argv.length);

            try{
                executeCommand(command, args);
            }catch(CommandNotFoundException e){
                System.out.println(e.getMessage());
                throw e;
            }
        }while(command.equals("exit"));
    }

    public void executeCommand(String commandName, String[] args) throws CommandNotFoundException {
        ui.findCommand(commandName)
                .execute(ui, args);
    }
}
