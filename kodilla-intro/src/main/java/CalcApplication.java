import java.util.Scanner;
public class CalcApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area of a circle with a radius of 10 equals " + area);

        double p = Calculator.PI;
        System.out.println("The value of the pi constant is approx. " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(Calculator.counter);
    }
}
