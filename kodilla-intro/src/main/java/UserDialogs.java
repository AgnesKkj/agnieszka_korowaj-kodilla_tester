import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if(name.length() >= 2 ) {
                return name;
            }
            System.out.println("The name is too short. Try again.");
        }
    }


}
