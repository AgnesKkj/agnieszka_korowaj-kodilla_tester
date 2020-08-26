package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] theMachines;
    private int numberOfMachines;
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
        this.theMachines = new CashMachine[0];
        this.numberOfMachines = 0;

    }
    //Dodaje bankomat
    public void addMachine(int index) {
        this.numberOfMachines++;
        CashMachine[] newTheMachines = new CashMachine[this.numberOfMachines];
        System.arraycopy(theMachines, 0, newTheMachines, 0, theMachines.length);
        newTheMachines[this.numberOfMachines - 1] = index;
        this.theMachines = newTheMachines;
    }

    public CashMachine[] getNumberOfMachines() {
        return theMachines;
    }

    public int totalBalance() {
        for(int balance: theMachines.length) {

            totalBalance+= balance;
        }
        return totalBalance;
    }

    public int totalDeposits() {
        for(int depositSize: theMachines.length) {

            totalBalance+= depositSize;
        }
        return totalDeposits;
    }

    public int totalWithdrawals() {
        for(int withdrawalSize: theMachines.length) {

            totalBalance+= withdrawalSize;
        }
        return totalWithdrawals;
    }




}
