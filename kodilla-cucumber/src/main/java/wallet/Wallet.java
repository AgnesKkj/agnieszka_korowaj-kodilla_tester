package wallet;

public class Wallet {

    private int initialBalance;
    private int newBalance;
    String negativeDepositMessage = "Error. Cannot deposit negative amounts.";
    String negativeWithdrawMessage = "Error. Cannot withdraw negative amounts.";
    String withdrawMoreThanBalanceMessage = "Error. You don't have enough money in your wallet to withdraw the requested amount.";

    public Wallet() {
    }

    public void deposit(int money) {
        if(initialBalance <0) {
            return;
        }
        else if(money < 0) {
            newBalance = initialBalance;
            System.out.println(negativeDepositMessage);
            return;
        }
        newBalance = initialBalance += money;
    }

    public void withdraw(int withdrawMoney) {
        if(initialBalance <0) {
            return;
        }
        else if(withdrawMoney < 0) {
            newBalance = initialBalance;
            System.out.println(negativeWithdrawMessage);
            return;
        }
        else if (withdrawMoney > initialBalance || withdrawMoney > newBalance) {
            System.out.println(withdrawMoreThanBalanceMessage);
            return;
        }
        newBalance = initialBalance -= withdrawMoney;
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