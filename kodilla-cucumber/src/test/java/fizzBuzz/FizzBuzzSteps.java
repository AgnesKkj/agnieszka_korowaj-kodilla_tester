import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private boolean isDivisibleByThree;
    private boolean isDivisibleByFive;
    private String answer;

    public FizzBuzzSteps() {

        Given("^number is 6$", () -> {
            this.number = 6;
        });

        Given("^number is 15$", () -> {
            this.number = 15;
        });

        Given("^number is 7$", () -> {
            this.number = 7;
        });

        Given("^number is 10$", () -> {
            this.number = 10;
        });

        When("^I ask if the number is divisible by three true$", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.isDivisibleByThree = fizzBuzzChecker.checkIfDivisibleByThree(number);
            Assert.assertEquals(true,this.isDivisibleByThree);
        });

        When("^I ask if the number is divisible by three false$", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.isDivisibleByThree = fizzBuzzChecker.checkIfDivisibleByThree(number);
            Assert.assertEquals(false,this.isDivisibleByThree);
        });

        When("^I ask if the number is divisible by five true$", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.isDivisibleByFive = fizzBuzzChecker.checkIfDivisibleByFive(number);
            Assert.assertEquals(true,this.isDivisibleByFive);
        });

        When("^I ask if the number is divisible by five false$", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.isDivisibleByFive = fizzBuzzChecker.checkIfDivisibleByFive(number);
            Assert.assertEquals(false,this.isDivisibleByFive);
        });

        When("^I compare its divisibility by three and five true false$", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.returnFizzBuzzMessage(number);
            Assert.assertEquals("Fizz",this.answer);
        });

        When("^I compare its divisibility by three and five false true", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.returnFizzBuzzMessage(number);
            Assert.assertEquals("Buzz",this.answer);
        });

        When("^I compare its divisibility by three and five false false", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.returnFizzBuzzMessage(number);
            Assert.assertEquals("None",this.answer);
        });

        When("^I compare its divisibility by three and five true true", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.returnFizzBuzzMessage(number);
            Assert.assertEquals("FizzBuzz",this.answer);
        });

        Then("I should get a message {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });


    }
}
