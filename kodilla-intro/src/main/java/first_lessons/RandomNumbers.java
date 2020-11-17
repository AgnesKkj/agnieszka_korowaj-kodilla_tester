package first_lessons;

import java.util.Random;

public class RandomNumbers {

    private int[] randomNumbers;
    private int total;
    private int min;
    private int max;


    public RandomNumbers() {
        this.randomNumbers = new int[5000];
    }

    public void randomizeNumbers() {
        //Losowanie pojedynczej wartości
        for (int i = 0; i < 1; i++) {
            Random rd = new Random();
            randomNumbers[i] = rd.nextInt(31);
            //System.out.println("Wylosowana liczba: " + randomNumbers[i]);
            total = total + randomNumbers[i];
            //System.out.println("Suma: " + total);
        }
    }

    //Losowanie po pętli wg warunku końcowego
    public void isSumTheEnd() {
        if (total == 5000) {
            return;
        }
        while(total < 5000) {
            this.randomizeNumbers();
            }
        }

        // Max i min wartości z tablicy

    public int minimalValue() {
        min = randomNumbers[0];
        for (int i=0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < min) {
                min = randomNumbers[i];
            }
        }
        return min;
    }

    public int maximalValue() {
        max = randomNumbers[0];
        for (int i=0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers numberTable = new RandomNumbers();
        numberTable.randomizeNumbers();
        numberTable.isSumTheEnd();
        System.out.println(" ");
        System.out.println("Minimalna wylosowana: " + numberTable.minimalValue());
        System.out.println("Maksymalna wylosowana: " + numberTable.maximalValue());
    }
}
