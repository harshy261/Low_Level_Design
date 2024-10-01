package Models;

public interface IState {

    public void insertMoney(VendingMachine machine, double amount);
    public void pressButton(VendingMachine machine, int slotNumber);
    public void returnChange(double amount);
    public void updateInventory(VendingMachine machine, int slotNumber);
    public void dispenseProduct(VendingMachine machine, int slotNumber);
}
