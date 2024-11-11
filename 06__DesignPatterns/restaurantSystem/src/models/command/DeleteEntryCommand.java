package models.command;

public class DeleteEntryCommand implements Command {
    //Singleton Instance of DB to interact with
    private Database database;
    private Entry entry;

    public DeleteEntryCommand(Database db, Entry entry) {
        this.database = db;
        this.entry = entry;
    }
    @Override
    public void execute() {
        database.deleteEntry(entry);
    }
}
