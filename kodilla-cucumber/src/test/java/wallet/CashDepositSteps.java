package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CashDepositSteps implements En {


    Wallet wallet = new Wallet();

    public CashDepositSteps() {
        Given("^my initial balance is 0$", () -> {
            wallet.setInitialBalance(0);
        });

        Given("^my initial balance is 200$", () -> {
            wallet.setInitialBalance(200);
        });

        Given("^my initial balance is 100$", () -> {
            wallet.setInitialBalance(100);
        });

        Given("^my initial balance is -1$", () -> {
            wallet.setInitialBalance(-1);
        });

        //rozumiem, że tutaj tolerujemy fail - tzn. w takim teście behawioralnym nie będzie obsługi wyjątków,
        // jeżeli chcę celowo uwzględnić przypadki na fail?

        But("^my initial balance isn't less than '0'$", () -> {
            Assert.assertFalse("Error. Invalid initial balance.", wallet.getInitialBalance() < 0);
        });

        When("^I deposit 200 in my wallet$", () -> {
            wallet.deposit(200);
        });

        When("^I deposit -100 in my wallet$", () -> {
            wallet.deposit(-100);
        });

        When("^I deposit 250 in my wallet$", () -> {
            wallet.deposit(250);
        });

        When("^I deposit 0 in my wallet$", () -> {
            wallet.deposit(0);
        });

        Then("^The new balance is 200$", () -> {
            Assert.assertEquals(200,wallet.getNewBalance());
        });

        Then("^The new balance is 0$", () -> {
            Assert.assertEquals(0,wallet.getNewBalance());
        });

        Then("^The new balance is 350$", () -> {
            Assert.assertEquals("Incorrect initial balance?",350,wallet.getNewBalance());
        });

        And("^the new balance is not 0$", () -> {
            Assert.assertNotEquals(0,wallet.getNewBalance());
        });

        And("^the new balance is not -100$", () -> {
            Assert.assertNotEquals(-100,wallet.getNewBalance());
        });

        And("^the new balance is not 100$", () -> {
            Assert.assertNotEquals(100,wallet.getNewBalance());
        });

        But("^with initial balance less than (\\d+)$", (String arg0) -> {
            Assert.assertFalse(wallet.getInitialBalance() >= 0);
        });

        Then("^an exception should be thrown$", () -> {
            throw new AssertionError();
        });



    }
}
