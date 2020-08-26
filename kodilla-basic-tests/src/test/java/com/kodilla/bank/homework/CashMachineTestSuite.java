package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {


    //Czy jest pusta na początku
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine(10000);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    //Czy dodaje transakcję wskazaną metodą
    @Test
    public void shouldAddTransaction() {
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.addTransaction(500);
        assertEquals(1, cashMachine.getSize());
        cashMachine.addTransaction(-200);
        assertEquals(2, cashMachine.getSize());
    }

    //Czy rejestruje wpłatę przy wartości dodatniej
    @Test
    public void shouldAddToDepositsPositiveValue() {
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.addTransaction(500);
        assertEquals(1, cashMachine.getDepositSize());
    }

    //Czy rejestruje wypłatę przy wartości ujemnej
    @Test
    public void shouldAddToWithdrawalsNegativeValue() {
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.addTransaction(-600);
        assertEquals(1, cashMachine.getWithdrawalSize());
    }

    //Czy dodaje do salda przy wartości dodatniej
    @Test
    public void shouldAddToBalancePositiveValue() {
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.addTransaction(400);
        assertEquals(10400, cashMachine.getBalance());
    }

    //Czy odejmuje od salda przy wartości ujemnej
    @Test
    public void shouldSubstractFromBalanceNegativeValue() {
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.addTransaction(-400);
        assertEquals(9600, cashMachine.getBalance());
    }

    //Czy nie dodaje do salda przy wartości 0
    @Test
    public void shouldDoNothingZeroValue() {
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.addTransaction(0);
        assertEquals(10000, cashMachine.getBalance());
    }

    //Czy nie wypłaca po osiągnięciu ujemnego salda
    @Test
    public void shouldNotWithdrawifBalanceNegative() {
        CashMachine cashMachine = new CashMachine(100);
        cashMachine.addTransaction(-200);
        assertEquals(100, cashMachine.getBalance());
    }


}
