package future.phase2.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import future.phase2.pages.DigitalPage;

public class GeneralSteps {

    DigitalPage digitalPage;

    @And("^The user is logged in with '(.*)' and '(.*)'$")
    public void theUserIsLoggedInWithAkutakbiasaGmailComAndRandom(String email, String password) {
        digitalPage.login(email, password);
    }

    @Given("^The user in on the digital product page$")
    public void theUserInOnTheDigitalProductPage() {
        digitalPage.open();
    }
}
