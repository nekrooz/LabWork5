package commands;

public abstract class AbstractComand {
    protected String command;
    protected String textInfo;
    protected int argsCounter = 0;

    public String getComand()
    {
    return command;
    }

    public String getTextInfo()
    {
        return textInfo;
    }

    public abstract void execute();
}

