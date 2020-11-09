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
            Assert.assertEquals(200,wallet.getNewBalance());
        });

        Given("^I have deposited 400 in my wallet$", () -> {
            wallet.setInitialBalance(0);
            wallet.deposit(400);
            Assert.assertEquals(400,wallet.getNewBalance());
        });

        Given("^I have deposited 0 in my wallet$", () -> {
            wallet.setInitialBalance(0);
            wallet.deposit(0);
            Assert.assertEquals(0,wallet.getNewBalance());
        });

        Given("^I have deposited -100 in my wallet$", () -> {
            wallet.setInitialBalance(0);
            wallet.deposit(-100);
            Assert.assertEquals(-100,wallet.getNewBalance());
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

        Then("^<withdrawnAmount> should be dispensed$", () -> {
        });

        And("^<withdrawnAmount> is equal <requestedAmount>$", () -> {
        });

        And("^the final balance is <finalBalance>$", () -> {
        });
    }
}
