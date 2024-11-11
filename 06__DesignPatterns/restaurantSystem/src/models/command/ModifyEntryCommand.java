package models.command;

public class ModifyEntryCommand implements Command{
    //Singleton Instance of DB to interact with
    private Database database;
    private Entry entry;

    public ModifyEntryCommand(Database db, Entry entry) {
        this.database = db;
        this.entry = entry;
    }
    @Override
    public void execute() {
        database.modifyEntry(entry);
    }
}
