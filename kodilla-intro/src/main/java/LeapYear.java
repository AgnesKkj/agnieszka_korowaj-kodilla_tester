public class LeapYear {
    public static void main(String [] args) {

      int year = 2020;
      int yearDividedByFour = year%4;
      int yearDividedByHundr = year%100;
      boolean leapYear;

System.out.println("Rok: " + year);


        if(yearDividedByHundr == 0 ) {
            leapYear = true;
            System.out.println("Dziel przez 100, reszta: " + yearDividedByHundr);
            System.out.println("Leap year!");
        }
        else if(yearDividedByHundr != 0 && yearDividedByFour == 0) {
            leapYear = true;
            System.out.println("Dziel przez 4, reszta: " + yearDividedByFour);
            System.out.println("Leap year!");
        }
        else {
            leapYear = false;
            System.out.println("Not leap year.");
        }




    }
}
