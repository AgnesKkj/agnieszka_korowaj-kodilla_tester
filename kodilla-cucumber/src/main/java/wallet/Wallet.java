package wallet;

public class Wallet {

    private int initialBalance;
    private int newBalance;

    public Wallet() {
    }

    public void deposit(int money) {
        if(initialBalance <0) {
            return;
        }
        else if(money < 0) {
            newBalance = initialBalance;
            System.out.println("Error. Cannot deposit negative amounts.");
            return;
        }
        newBalance = initialBalance += money;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public int getNewBalance() {
        return newBalance;
    }


}