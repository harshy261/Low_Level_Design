package Models;

public class DispenseProductState implements IState{
    VendingMachine system;

    DispenseProductState(VendingMachine machine) {
        system = machine;
    }
    @Override
    public void insertMoney(VendingMachine machine, double amount) {

    }

    @Override
    public void pressButton(VendingMachine machine, int slotNumber) {

    }

    @Override
    public void returnChange(double amount) {

    }

    @Override
    public void updateInventory(VendingMachine machine, int slotNumber) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine, int slotNumber) {
        //after giving product
        //change state -> NoMoneyInsertedState
    }
}
