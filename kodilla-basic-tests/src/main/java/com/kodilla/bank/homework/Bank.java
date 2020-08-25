package com.kodilla.bank.homework;

public class Bank {

    private String name;
    private int index;
    private int numberOfMachines;
    private CashMachine[] allTheMachines;

    private int totalDeposits;
    private int totalWithdrawals;
    private int totalBalance;
    private int depositAverage;
    private int withdrawalAverage;
    private int totalAverage;

    //jak stworzyć tablicę obiektów klasy CashMachine, żeby brało stamtąd zmienne depositSize, withdrawSize, balance itd.

    public Bank() {
        allTheMachines = new CashMachine[0];
    }

    //Dodaje bankomat
    public void addMachine(String name) {
        this.numberOfMachines++;
        CashMachine[] newAllMachines = new CashMachine[this.numberOfMachines];
        System.arraycopy(allTheMachines, 0, newAllMachines, 0, allTheMachines.length);
        this.allTheMachines = newAllMachines;
    }

    public int[] getNumberOfMachines() {
        return allTheMachines;
    }






}
