package Models;

import java.util.List;

public class VendingMachine {

    private NoMoneyInsertedState noMoneyState = new NoMoneyInsertedState(this);
    private MoneyInsertedState moneyState = new MoneyInsertedState(this);
    private DispenseProductState dispenseProductState = new DispenseProductState(this);
    private IState state;
    private List<Slot> slots;
    private List<Slot> availableSlots;
    private int collectedCash;
    private List<Admin> operators;
    private List<Product> productList;

    private static VendingMachine machineInstance = null;

    private VendingMachine() {}

    public static VendingMachine getInstance() {
        if(machineInstance == null) {
            machineInstance = new VendingMachine();
        }
        return machineInstance;
    }

    public void setState(IState newState) {
        state = newState;
    }

    public NoMoneyInsertedState getNoMoneyInsertedState() {
        return noMoneyState;
    }
    public MoneyInsertedState getMoneyInsertedState() {
        return moneyState;
    }
    public DispenseProductState getDispenseProductState() {
        return dispenseProductState;
    }

    public void selectProduct(int slotNumber) {

    }
    public void insertMoney(double amount) {

    }
    public void pressButton(int slotNumber) {

    }
    public void updateInventory(int slotNumber) {

    }
    public void dispenseProduct(int slotNumber) {

    }
    public void returnChange(double amount) {

    }
    public void showErrorMsg() {}
    public void addAdmin(Admin user) {}
    public void removeAdmin(Admin user) {}
    public void validateAdmin(Admin user) {}
    public void openCashDispenser() {}
    public void searchProduct(Product item) {}
}
