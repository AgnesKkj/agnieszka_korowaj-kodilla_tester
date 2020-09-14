package com.kodilla.stream.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";
        String[] nameParts = username.split(" ");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);

        /*//NullPointerException - kiedy coś ma być, a nie ma
        String usernameTwo = null;
        String[] namePartsTwo = usernameTwo.split(" ");
        System.out.println("First name: " + namePartsTwo[0]);
        System.out.println("Last name: " + namePartsTwo[1]);*/

/*        //ArrayIndexOutOfBounds - kiedy metoda domaga się zakresu większego niż jej argumenty
        String usernameThree = "John";
        String[] namePartsThree = usernameThree.split(" ");
        System.out.println("First name: " + namePartsThree[0]);
        System.out.println("Last name: " + namePartsThree[1]);*/




    }
}
