package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine(10000);


    //Czy jest pusta na początku
    @Test
    public void shouldHaveZeroLength() {
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    //Czy dodaje transakcję wskazaną metodą
    @Test
    public void shouldAddTransaction() {
        cashMachine.addTransaction(500);
        assertEquals(1, cashMachine.getSize());
        cashMachine.addTransaction(-200);
        assertEquals(2, cashMachine.getSize());
    }

    //Czy nie uruchamia metody przy wartości 0
    @Test
    public void shouldNotAddTransactionZeroValue() {
        cashMachine.addTransaction(0);
        assertEquals(0,cashMachine.getSize());
        assertEquals(0,cashMachine.getDepositSize());
        assertEquals(0,cashMachine.getWithdrawalSize());
    }

    //Czy rejestruje wpłatę przy wartości dodatniej
    @Test
    public void shouldAddToDepositsPositiveValue() {
        cashMachine.addTransaction(500);
        assertEquals(1, cashMachine.getDepositSize());
    }

    //Czy rejestruje wypłatę przy wartości ujemnej
    @Test
    public void shouldAddToWithdrawalsNegativeValue() {
        cashMachine.addTransaction(-600);
        assertEquals(1, cashMachine.getWithdrawalSize());
    }

    //Czy dodaje do salda przy wartości dodatniej
    @Test
    public void shouldAddToBalancePositiveValue() {
        cashMachine.addTransaction(400);
        assertEquals(10400, cashMachine.getBalance());
    }

    //Czy odejmuje od salda przy wartości ujemnej
    @Test
    public void shouldSubstractFromBalanceNegativeValue() {
        cashMachine.addTransaction(-400);
        assertEquals(9600, cashMachine.getBalance());
    }

    //Czy nie dodaje do salda przy wartości 0
    @Test
    public void shouldDoNothingZeroValue() {
        cashMachine.addTransaction(0);
        assertEquals(10000, cashMachine.getBalance());
    }

    //Czy zatrzymuje wypłacanie po osiągnięciu zerowego salda
    @Test
    public void shouldNotWithdrawifBalanceNegative() {
        cashMachine.addTransaction(-10200);
        assertEquals(10000, cashMachine.getBalance());
        assertEquals(0,cashMachine.withdrawalSize);
    }

    //Czy sumuje wartości wpłat
    @Test
    public void shouldSumDepositValues() {
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(400);
        cashMachine.getDepositSum();
        assertEquals(1100, cashMachine.getDepositSum());
    }

    //Czy nie dodaje wypłaty do wpłat
    @Test
    public void shouldNotAddWithdrawalToDeposits() {
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(400);
        cashMachine.getDepositSum();
        assertEquals(900, cashMachine.getDepositSum());
    }

    //Czy sumuje wartości wypłat
    @Test
    public void shouldSumWithdrawalValues() {
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-400);
        cashMachine.getWithdrawalSum();
        assertEquals(-1100, cashMachine.getWithdrawalSum());
    }

    //Czy nie dodaje wpłaty do wypłat
    @Test
    public void shouldNotAddDepositToWithdrawals() {
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(400);
        cashMachine.getDepositSum();
        assertEquals(-700, cashMachine.getWithdrawalSum());
    }

}
