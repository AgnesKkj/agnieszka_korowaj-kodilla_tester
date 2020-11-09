package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public int withdraw(Wallet wallet, int amount) {
        cashSlot.dispense(amount);
        return amount;
    }

}