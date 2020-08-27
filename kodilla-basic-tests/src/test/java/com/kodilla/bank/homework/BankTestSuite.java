package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank theBank = new Bank();

    //Czy tablica jest pusta na początku
    @Test
    public void shouldHaveZeroLength() {
        theBank.getNumberOfMachines();
        assertEquals(0, theBank.getNumberOfMachines());
    }

    //Czy dodaje bankomat wg metody
    @Test
    public void shouldAddMachine() {
        CashMachine machineOne = new CashMachine(5000);
        theBank.addMachine(machineOne);
        theBank.getNumberOfMachines();
        assertEquals(1, theBank.getNumberOfMachines());
        assertEquals(5000,machineOne.balance);
    }

    //Czy bankomat dodaje transakcję metodą z CashMachine, jeśli wywołamy ją w klasie Bank
    @Test
    public void shouldAddTransaction() {
        CashMachine machineOne = new CashMachine(5000);
        theBank.addMachine(machineOne);
        machineOne.addTransaction(500);
        assertEquals(500, machineOne.transactions[0]);
        machineOne.addTransaction(-200);
        assertEquals(-200, machineOne.transactions[1]);
    }

    //Czy przelicza saldo metodą z CashMachine, jeśli wywołamy ją w klasie Bank
    @Test
    public void shouldAddToBalanceFromBank() {
        CashMachine machineOne = new CashMachine(5000);
        theBank.addMachine(machineOne);
        machineOne.addTransaction(500);
        assertEquals(5500, machineOne.balance);
        machineOne.addTransaction(-200);
        assertEquals(5300, machineOne.balance);
    }

    //Czy liczy bilans całkowity
    @Test
    public void shouldCountTotalBalance() {
        CashMachine machineOne = new CashMachine(5000);
        theBank.addMachine(machineOne);
        machineOne.getBalance();
        CashMachine machineTwo = new CashMachine(2000);
        theBank.addMachine(machineTwo);
        machineTwo.getBalance();
        CashMachine machineThree = new CashMachine(3000);
        theBank.addMachine(machineThree);
        machineThree.getBalance();
        assertEquals(10000,theBank.totalBalance());
    }

    //Czy liczy łączną ilość wpłat
    @Test
    public void shouldCountTotalDeposit() {
        CashMachine machineOne = new CashMachine(5000);
        theBank.addMachine(machineOne);
        machineOne.addTransaction(300);
        machineOne.getDepositSize();
        CashMachine machineTwo = new CashMachine(2000);
        theBank.addMachine(machineTwo);
        machineTwo.addTransaction(200);
        machineTwo.getDepositSize();
        CashMachine machineThree = new CashMachine(3000);
        theBank.addMachine(machineThree);
        machineThree.addTransaction(500);
        machineThree.getDepositSize();
        assertEquals(3,theBank.totalDeposits());
    }

    //Czy liczy łączną ilość wypłat
    @Test
    public void shouldCountTotalWithdrawal() {
        CashMachine machineOne = new CashMachine(5000);
        theBank.addMachine(machineOne);
        machineOne.addTransaction(-300);
        machineOne.getWithdrawalSize();
        CashMachine machineTwo = new CashMachine(2000);
        theBank.addMachine(machineTwo);
        machineTwo.addTransaction(-200);
        machineTwo.getWithdrawalSize();
        CashMachine machineThree = new CashMachine(3000);
        theBank.addMachine(machineThree);
        machineThree.addTransaction(-500);
        machineThree.getWithdrawalSize();
        assertEquals(3,theBank.totalWithdrawals());
    }

    //Czy liczy średnią sumę wpłat

    //Czy liczy średnią sumę wypłat
    //Czy liczy łączną średnią





}
