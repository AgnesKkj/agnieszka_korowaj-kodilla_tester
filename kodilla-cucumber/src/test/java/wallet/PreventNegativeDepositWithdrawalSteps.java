package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventNegativeDepositWithdrawalSteps implements En {

    Wallet wallet = new Wallet();

    public PreventNegativeDepositWithdrawalSteps() {

        Given("^there is 100 in my wallet$", () -> {
            wallet.setInitialBalance(100);
        });

        When("^I try to deposit -1$", () -> {
            wallet.deposit(-1);
        });

        Then("^The deposit is not made$", () -> {
            Assert.assertNotEquals("Error. Cannot deposit negative amounts.",99,wallet.getNewBalance());
        });

        And("^I get a negative deposit error message$", () -> {
            String errorMessage = "Error. Cannot deposit negative amounts.";
            Assert.assertEquals(errorMessage, wallet.negativeDepositMessage);

        });


        When("^I try to withdraw -1$", () -> {
            wallet.withdraw(-1);
        });

        Then("^The withdrawal is not made$", () -> {
            Assert.assertNotEquals("Error. Cannot deposit negative amounts.",101,wallet.getNewBalance());
        });

        And("^I get a negative withdrawal error message$", () -> {
            String errorMessage = "Error. Cannot withdraw negative amounts.";
            Assert.assertEquals(errorMessage, wallet.negativeWithdrawMessage);
        });


    }
}
