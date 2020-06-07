package future.phase2.steps;

import cucumber.api.java.en.Then;
import future.phase2.pages.Checkout1Page;
import future.phase2.pages.DigitalPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Checkout1Steps {
    Checkout1Page checkout1Page;
    DigitalPage digitalPage;

    @Then("^The checkout amount should be (.*)$")
    public void theCheckoutAmountShouldBeAny(String amount) {
        digitalPage.checkout();
        assertThat("The handphone number don't match", amount, equalTo(checkout1Page.getHandphoneNumber()));
    }

    @Then("^The checkout number should be (.*)$")
    public void theCheckoutNumberShouldBeHandphone(String handphone) {
    }
}
