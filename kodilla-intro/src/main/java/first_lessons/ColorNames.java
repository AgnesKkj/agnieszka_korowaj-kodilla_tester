package first_lessons;

import java.util.Scanner;

public class ColorNames {

    public static String enterFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the first letter of a color name:");
            String firstLetter = scanner.nextLine().trim();
            switch(firstLetter) {
                case "b":
                    System.out.println("Enter the second and the third letter...");
                    String bColors = scanner.nextLine().trim();
                    switch (bColors) {
                        case "la":
                            return "black";
                        case "lu":
                            return "blue";
                        case "ro":
                            return "brown";
                        default:
                            System.out.println("Can't find a color with a name starting like this. Sorry!");
                    }
                    ;
                case "c":
                    return "cyan";
                case "g":
                    return "green";
                case "m":
                    return "magenta";
                case "r":
                    return "red";
                case "w":
                    return "white";
                case "y":
                    return "yellow";
                default:
                    System.out.println("Can't find a color with a name starting like this. Sorry!");
            }

        }

    }

    public static void main(String[] args) {

        ColorNames.enterFirstLetter();

    }
}
