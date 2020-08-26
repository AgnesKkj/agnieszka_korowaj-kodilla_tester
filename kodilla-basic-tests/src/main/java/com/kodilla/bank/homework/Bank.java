package com.kodilla.bank.homework;

public class Bank {

    private int numberOfMachines;
    private CashMachine[] allTheMachines;
    private int index;

    private int totalDeposits;
    private int totalWithdrawals;
    private int totalBalance;
    private int depositAverage;
    private int withdrawalAverage;
    private int totalAverage;

    //jak stworzyć tablicę obiektów klasy CashMachine, żeby brało stamtąd zmienne depositSize, withdrawSize, balance itd.
    //do iteracji

    public Bank() {
        allTheMachines = new CashMachine[0];
        this.numberOfMachines = 0;
        this.index = index;

    }
    //Dodaje bankomat
    public void addMachine(int index) {
        this.numberOfMachines++;
        CashMachine[] newAllMachines = new CashMachine[this.numberOfMachines];
        System.arraycopy(allTheMachines, 0, newAllMachines, 0, allTheMachines.length);
        newAllMachines[this.numberOfMachines - 1] = index;
        this.allTheMachines = newAllMachines;
    }

    public CashMachine[] getNumberOfMachines() {
        return allTheMachines;
    }

    public int totalBalance() {
        for(int balance: allTheMachines.length) {
            totalBalance+= balance;
        }
        return totalBalance;
    }

    public int totalDeposits() {
        for(int depositSize: allTheMachines.length) {
            totalBalance+= depositSize;
        }
        return totalDeposits;
    }

    public int totalWithdrawals() {
        for(int withdrawalSize: allTheMachines.length) {
            totalBalance+= withdrawalSize;
        }
        return totalWithdrawals;
    }




}
