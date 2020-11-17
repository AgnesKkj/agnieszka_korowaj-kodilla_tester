package advanced_calculator;

import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner1 = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your name: ");
            String name = scanner1.nextLine().trim();
            if(name.length() >= 2 ) {
                return name;
            }
            System.out.println("The name is too short. Try again.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner2 = new Scanner(System.in);
        while(true) {
            System.out.println("Select calculation: A - add; S - substract; D - divide; M - multiply: ");
            String calc = scanner2.nextLine().trim().toUpperCase();
            switch(calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default: System.out.println("Wrong command. Try again.");
            }

        }

    }
    public static int getValue() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int val = scanner3.nextInt();
        return val;
    }


}
