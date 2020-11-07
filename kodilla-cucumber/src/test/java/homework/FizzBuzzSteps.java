package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private boolean isDivisibleByThree;
    private boolean isDivisibleByFive;
    private String answer;

    public FizzBuzzSteps() {
        Given("number is ", () -> {
            this.number = 6;
        });

        Given("number is ", () -> {
            this.number = 15;
        });

        Given("number is ", () -> {
            this.number = 7;
        });

        Given("number is ", () -> {
            this.number = 10;
        });

        When("I ask if the number <isDivisibleByThree>", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.isDivisibleByThree = fizzBuzzChecker.checkIfDivisibleByThree(number);
        });

        And("I ask if the number <isDivisibleByFive>",() -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.isDivisibleByFive = fizzBuzzChecker.checkIfDivisibleByThree(number);
        });

        When("I compare <isDivisibleByThree> and <isDivisibleByFive>", () -> {
            FizzBuzzReturnMessages fizzBuzzReturnMessages = new FizzBuzzReturnMessages();
            this.answer = fizzBuzzReturnMessages.returnFizzBuzzMessage(number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}
