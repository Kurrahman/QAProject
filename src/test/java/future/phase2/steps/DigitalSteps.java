package future.phase2.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import future.phase2.pages.Checkout1Page;
import future.phase2.pages.DigitalPage;
import future.phase2.pages.PulsaPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class DigitalSteps {

    PulsaPage pulsaPage;
    DigitalPage digitalPage;
    Checkout1Page checkout1Page;

    @When("^The user fill (.*) to the form$")
    public void theUserFillHandphoneToTheForm(String number) {
        pulsaPage.fillNumber(number);
    }

    @And("^The user change (\\d+) from position (\\d+) to (.*)$")
    public void theUserChangeNdigitFromPositionToChange(int n, int pos, String change) {
        pulsaPage.changeInputNumber(n, pos,change);
    }

    @Then("^The user should not be able to continue to checkout$")
    public void theUserShouldNotBeAbleToContinueToCheckout() {
        digitalPage.checkout();
        assertThat("The number filled considered valid", !checkout1Page.buttonVisible());
    }
}
