package wallet;
import io.cucumber.java8.En;
import org.junit.Assert;

public class CashWithdrawalSteps implements En {

    public CashWithdrawalSteps() {

        Wallet wallet = new Wallet();
        CashSlot cashSlot = new CashSlot();
        Cashier cashier = new Cashier(cashSlot);

        Given("^I have deposited 200 in my wallet$", () -> {
            wallet.setInitialBalance(0);
            wallet.deposit(200);
            Assert.assertEquals("Error. Cannot deposit negative amounts.",200,wallet.getNewBalance());
        });

        Given("^I have deposited 400 in my wallet$", () -> {
            wallet.setInitialBalance(0);
            wallet.deposit(400);
            Assert.assertEquals("Error. Cannot deposit negative amounts.",400,wallet.getNewBalance());
        });

        Given("^I have deposited 0 in my wallet$", () -> {
            wallet.setInitialBalance(0);
            wallet.deposit(0);
            Assert.assertEquals("Error. Cannot deposit negative amounts.",0,wallet.getNewBalance());
        });

        Given("^I have deposited -100 in my wallet$", () -> {
            wallet.setInitialBalance(0);
            wallet.deposit(-100);
            Assert.assertEquals("Error. Cannot deposit negative amounts.",-100,wallet.getNewBalance());
        });

        When("^I request 30$", () -> {
            cashier.withdraw(wallet,30);
        });

        When("^I request 200$", () -> {
            cashier.withdraw(wallet,200);
        });

        When("^I request 0$", () -> {
            cashier.withdraw(wallet,0);
        });

        When("^I request 400$", () -> {
            cashier.withdraw(wallet,400);
        });

        When("^I request -100$", () -> {
            cashier.withdraw(wallet,-100);
        });

        Then("^30 should be dispensed$", () -> {
            wallet.withdraw(30);
            cashSlot.dispense(30);
            Assert.assertEquals(30,cashSlot.getDispensedAmount());
        });

        Then("^0 should be dispensed$", () -> {
            wallet.withdraw(0);
            cashSlot.dispense(0);
            Assert.assertEquals(0,cashSlot.getDispensedAmount());
        });

        Then("^200 should be dispensed$", () -> {
            wallet.withdraw(200);
            cashSlot.dispense(200);
            Assert.assertEquals(200,cashSlot.getDispensedAmount());
        });

        And("^the final balance is 170$", () -> {
            Assert.assertEquals(170, wallet.getNewBalance());
        });

        And("^the final balance is 200$", () -> {
            Assert.assertEquals(200, wallet.getNewBalance());
        });

        And("^the final balance is 0$", () -> {
            Assert.assertEquals(0, wallet.getNewBalance());
        });

        And("^the final balance is -100$", () -> {
            Assert.assertEquals(-100, wallet.getNewBalance());
        });


    }
}
