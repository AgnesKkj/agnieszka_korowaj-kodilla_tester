package fizzBuzz;

public class FizzBuzzChecker {

    FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();

    public boolean checkIfDivisibleByThree(int number) {
        boolean isDivByThree;
        if(number % 3 == 0) {
            isDivByThree = true;
        }
        else isDivByThree = false;
        return isDivByThree;
    }

    public boolean checkIfDivisibleByFive(int number) {
        boolean isDivByFive;
        if(number % 5 == 0) {
            isDivByFive = true;
        }
        else isDivByFive = false;
        return isDivByFive;
    }

    public String returnFizzBuzzMessage(int number) {

        if(fizzBuzzChecker.checkIfDivisibleByThree(number) == true && fizzBuzzChecker.checkIfDivisibleByFive(number) == false) {
            return "Fizz";
        }
        else if(fizzBuzzChecker.checkIfDivisibleByThree(number) == false && fizzBuzzChecker.checkIfDivisibleByFive(number) == true) {
            return "Buzz";
        }
        else if(fizzBuzzChecker.checkIfDivisibleByThree(number) == true && fizzBuzzChecker.checkIfDivisibleByFive(number) == true) {
            return "FizzBuzz";
        }
        return "None";
    }

}
