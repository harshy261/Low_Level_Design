package models;
import constants.TableStatus;

import java.util.List;

public class Table {
    private int tableId;
    private TableStatus status;
    private int maxCapacity;
    private int location;
    private List<TableSeat> seats;
}
