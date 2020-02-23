package commands;

public class Add extends AbstractComand {
    public Add(){
        command = "add";
        textInfo = "Добавление нового элемента в коллекцию. Принимает один аргумент";
    }

    @Override
    public void execute() {
    }
}
