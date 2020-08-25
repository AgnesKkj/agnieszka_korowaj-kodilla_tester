package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    //Czy tablica jest pusta na początku
    @Test
    public void shouldHaveZeroLength() {
        Bank theBank = new Bank();
        CashMachine[] allTheMachines = theBank.getNumberOfMachines();
        assertEquals(0, allTheMachines.length);
    }

    //Czy dodaje bankomat wg metody
    @Test
    public void shouldAddMachine() {
        Bank theBank = new Bank();
        theBank.addMachine("Bankomat 1");
        int[] allTheMachines = theBank.getNumberOfMachines();
        assertEquals(1, allTheMachines.length);
    }

    //Czy liczy łączną ilość wpłat
    //Czy liczy łączną ilość wypłat
    //Czy liczy średnią sumę wpłat
    //Czy liczy średnią sumę wypłat
    //Czy liczy średnią
    //Czy liczy bilans całkowity




}
