package Models;

public class NoMoneyInsertedState implements IState{

    VendingMachine system;

    NoMoneyInsertedState(VendingMachine machine) {
        system = machine;
    }
    @Override
    public void insertMoney(VendingMachine machine, double amount) {

        //change state -> moneyInsertedState
        //system.setState(system.getMoneyInsertedState());
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

    }
}
