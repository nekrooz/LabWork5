package utils;

import java.util.Arrays;
import java.util.Scanner;

public class IO {
    Scanner scanner;
    private UserInterface ui;

    public IO(String inputPath, String outputPath) {
        ui = new UserInterface(inputPath, outputPath);
        scanner = new Scanner(System.in);
    }

    public void listen(){
        readCommand();
        listen();
    }

    public void readCommand(){
        Logger.print("> ");

        String[] argv = scanner.nextLine().split(" ");

        String command = argv[0].toLowerCase();
        argv = Arrays.copyOfRange(argv, 1, argv.length);

        if (command.length() == 0)
            return;

        executeCommand(command, argv);

    }

    public void executeCommand(String commandName, String[] args){
        ui.executeCommand(commandName, args);
    }
}
