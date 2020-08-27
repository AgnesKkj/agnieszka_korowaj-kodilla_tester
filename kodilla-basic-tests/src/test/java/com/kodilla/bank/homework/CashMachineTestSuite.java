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

    //Czy nie zwiększa zakresu, nie rejestruje wpłaty ani wypłaty przy wartości 0
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

    //Czy nie wypłaca po osiągnięciu ujemnego salda
    @Test
    public void shouldNotWithdrawifBalanceNegative() {
        cashMachine.addTransaction(-200);
        assertEquals(10000, cashMachine.getBalance());
    }


}
