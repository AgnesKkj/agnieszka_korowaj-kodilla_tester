package com.kodilla.bank.homework;

public class Bank {
    private int totalBalance;
    private CashMachine totalDeposits;
    private CashMachine totalWithdrawals;
    private CashMachine totalDepositAvg;
    private CashMachine totalWithdrawalAvg;





    public static void main(String[] args) {
        CashMachine[] allTheMachines = new CashMachine[2];
        allTheMachines[0] = new CashMachine("Bankomat 1",10000);
        allTheMachines[1] = new CashMachine("Bankomat 2",5000);

        allTheMachines[0].addTransaction(500);
        allTheMachines[0].addTransaction(-1000);
        allTheMachines[0].addTransaction(0);
        allTheMachines[0].addTransaction(300);
        allTheMachines[1].addTransaction(600);
        allTheMachines[0].addTransaction(-200);
        allTheMachines[0].addTransaction(-9000);


    }

}