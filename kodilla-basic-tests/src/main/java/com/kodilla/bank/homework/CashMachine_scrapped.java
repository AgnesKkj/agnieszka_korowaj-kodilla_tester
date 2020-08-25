/*package com.kodilla.bank.homework;

public class CashMachine {

    private String name;
    private int machineBalance;
    private Bank deposit;
    private Bank withdrawal;
    private int transactionAmount;

    public CashMachine(String name, int machineBalance) {
        this.name = name;
        this.transactionAmount = transactionAmount;
        this.machineBalance = machineBalance;
        this.deposit = new Bank();
        this.withdrawal = new Bank();
    }

    public void addTransaction(int value) {
        if (value > 0) {
            this.deposit.add(value);
            this.transactionAmount++;
            System.out.println("Wpłacono " + value + " do " + this.name);
        } else if (value < 0) {
            if (this.machineBalance < value * -1) {
                System.out.println("Bankomat nie ma środków do dokonania wypłaty.");
            } else {
                this.withdrawal.add(value);
                this.transactionAmount++;
                System.out.println("Wypłacono " + value * -1 + " z " + this.name);
            }
        } else {
            System.out.println("Nie zmieniono stanu konta.");
        }
        System.out.println("Saldo: " + this.getmachineBalance());
    }

    public int getmachineBalance() {
        return machineBalance;
    }

    public int returnSize() {
        return transactionAmount;
    }
}
*/
