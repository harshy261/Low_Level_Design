package models.command;

import javax.xml.crypto.Data;

public class AddEntryCommand implements Command{
    //Singleton Instance of DB to interact with
    private Database database;
    private Entry entry;

    public AddEntryCommand(Database db, Entry entry) {
        this.database = db;
        this.entry = entry;
    }
    @Override
    public void execute() {
        database.addEntry(entry);
    }
}
