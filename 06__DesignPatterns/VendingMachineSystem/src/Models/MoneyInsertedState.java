package Models;

public class MoneyInsertedState implements IState{
    VendingMachine system;

    MoneyInsertedState(VendingMachine machine) {
        system = machine;
    }
    @Override
    public void insertMoney(VendingMachine machine, double amount) {

    }

    @Override
    public void pressButton(VendingMachine machine, int slotNumber) {
        //search for product
        //if available
        //validate money
        //change state -> dispense State
    }

    @Override
    public void returnChange(double amount) {

    }

    @Override
    public void updateInventory(VendingMachine machine, int slotNumber) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine, int slotNumber) {

    }
}
