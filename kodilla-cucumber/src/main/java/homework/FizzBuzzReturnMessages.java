package homework;

public class FizzBuzzReturnMessages {

    FizzBuzzChecker fizzBuzzChecker;

    public String returnFizzBuzzMessage(int number) {

        if(fizzBuzzChecker.checkIfDivisibleByThree(number) == true && fizzBuzzChecker.checkIfDivisibleByFive(number) == false) {
            return "Fizz";
        }
        else if(fizzBuzzChecker.checkIfDivisibleByThree(number) == false && fizzBuzzChecker.checkIfDivisibleByFive(number) == true) {
            return "Fizz";
        }
        else if(fizzBuzzChecker.checkIfDivisibleByThree(number) == true && fizzBuzzChecker.checkIfDivisibleByFive(number) == true) {
            return "FizzBuzz";
        }
        return "None";
    }
}
