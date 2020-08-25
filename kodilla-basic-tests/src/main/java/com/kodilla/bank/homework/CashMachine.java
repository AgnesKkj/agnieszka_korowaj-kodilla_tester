package com.kodilla.bank.homework;

public class CashMachine {

    int[] transactions;
    int balance;
    int size;
    int depositSize;
    int withdrawalSize;
    String name;

    public CashMachine(String name, int balance) {
        this.name = name;
        this.transactions = new int[0];
        this.size = 0;
        this.balance = balance;
    }

    public void addTransaction(int value) {
        this.size++;
        int[] newTransactions = new int[this.size];
        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
        newTransactions[this.size - 1] = value;
        this.transactions = newTransactions;
        System.out.println("Bilans " + this.name + " " + this.getBalance());
        if (value > 0) {
            this.depositSize++;
            balance += value;
            System.out.println("Wpłacono " + value + " do " + this.name);
        } else if (value < 0) {
            if (balance < value*-1) {
                System.out.println("Bankomat nie ma środków do wykonania wypłaty.");
            } else {
                this.withdrawalSize++;
                balance += value;
                System.out.println("Wypłacono " + value *-1 + " z " + this.name);
            }
        }
        else {
            System.out.println("Nie zmieniono stanu konta.");

        }
        System.out.println("Bilans " + this.name + " " + this.getBalance());
        System.out.println("Lącznie operacji: " + this.getSize());
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        return balance;
    }

    public int getSize() {
        return size;
    }

    public int getDepositSize() {
        return depositSize;
    }

    public int getWithdrawalSize() {
        return withdrawalSize;
    }

}
