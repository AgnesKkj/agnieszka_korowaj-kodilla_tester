package first_lessons;

public class ArrayNames {
    public static void main(String [] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        for(int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println(" ");
        System.out.println("Teraz od końca...");
        System.out.println(" ");

        for(int i= names.length -1; i >= 0; i--) {
            System.out.println(names[i]);
        }

    }
}
