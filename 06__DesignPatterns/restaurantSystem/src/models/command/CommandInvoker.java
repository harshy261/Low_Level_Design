package models.command;

public class CommandInvoker {
    private Command command;
    public CommandInvoker(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if(command != null) {
            command.execute();
        }
    }
}
