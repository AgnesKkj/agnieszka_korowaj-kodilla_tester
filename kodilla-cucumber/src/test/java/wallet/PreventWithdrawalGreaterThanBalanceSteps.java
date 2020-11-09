package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventWithdrawalGreaterThanBalanceSteps implements En {

    Wallet wallet = new Wallet();

    public PreventWithdrawalGreaterThanBalanceSteps() {

        Given("^there is 150 in my wallet$", () -> {
            wallet.setInitialBalance(150);
        });

        When("^I withdraw 250$", () -> {
            wallet.withdraw(250);
        });

        Then("^nothing should be dispensed$", () -> {
            Assert.assertNotEquals("Error. You don't have enough money in your wallet to withdraw the requested amount.", -100,
                    wallet.getNewBalance());
        });

        And("^I should be told that I don't have enough money in my wallet$", () -> {
            String errorMessage = "Error. You don't have enough money in your wallet to withdraw the requested amount.";
            Assert.assertEquals(errorMessage, wallet.withdrawMoreThanBalanceMessage);
        });
    }
}
