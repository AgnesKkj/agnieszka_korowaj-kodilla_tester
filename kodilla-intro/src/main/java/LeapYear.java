public class LeapYear {
    public static void main(String [] args) {

      int year = 2020;
      int yearDividedByFour = year%4;
      int yearDividedByHundr = year%100;
      int yearDividedByFourHundr = year%400;
      boolean leapYear;

System.out.println("Rok: " + year);
System.out.println("Dziel przez 4, reszta: " + yearDividedByFour);
System.out.println("Dziel przez 100, reszta: " + yearDividedByHundr);
System.out.println("Dziel przez 400, reszta: " + yearDividedByFourHundr);


        if(yearDividedByFour == 0 || yearDividedByHundr == 0 || yearDividedByFourHundr == 0) {
            leapYear = true;
            System.out.println("Leap year!");
        }
        else {
            leapYear = false;
            System.out.println("Not leap year.");
        }




    }
}
