package first_lessons;

public class Loops {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 23;
        numbers[1] = 9;
        numbers[2] = 44;
        numbers[3] = 5;
        numbers[4] = 17;

        int sum = 0;

        for(int i=0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Suma liczb w tablicy: " + sum);
        System.out.println(" ");



    }
}
