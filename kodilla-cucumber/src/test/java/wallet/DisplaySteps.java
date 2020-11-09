package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplaySteps implements En {

    Wallet wallet = new Wallet();

    public DisplaySteps() {
        Given("^there is 30 in my wallet$", () -> {
            wallet.setInitialBalance(30);

        });

        Given("^there is 1 in my wallet$", () -> {
            wallet.setInitialBalance(1);

        });

        Given("^there is 200 in my wallet$", () -> {
            wallet.setInitialBalance(200);

        });

        Given("^there is 0 in my wallet$", () -> {
            wallet.setInitialBalance(0);

        });

        When("^I check the balance$", () -> {
            wallet.getInitialBalance();
        });

        Then("^I should see that the balance is 30$", () -> {
            Assert.assertEquals(30, wallet.getInitialBalance());
        });

        Then("^I should see that the balance is 1$", () -> {
            Assert.assertEquals(1, wallet.getInitialBalance());
        });

        Then("^I should see that the balance is 200$", () -> {
            Assert.assertEquals(200, wallet.getInitialBalance());
        });

        Then("^I should see that the balance is 0$", () -> {
            Assert.assertEquals(0, wallet.getInitialBalance());
        });

        And("^I should see that the balance is not 0$", () -> {
            Assert.assertNotEquals(0, wallet.getInitialBalance());
        });

        And("^I should see that the balance is not -1$", () -> {
            Assert.assertNotEquals(-1, wallet.getInitialBalance());
        });

        And("^I should see that the balance is not 400$", () -> {
            Assert.assertNotEquals(400, wallet.getInitialBalance());
        });

        And("^I should see that the balance is not 100$", () -> {
            Assert.assertNotEquals(100, wallet.getInitialBalance());
        });
    }
}
