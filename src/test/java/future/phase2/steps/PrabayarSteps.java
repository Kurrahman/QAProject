package future.phase2.steps;

import cucumber.api.java.en.And;
import future.phase2.pages.PulsaPage;

public class PrabayarSteps {
    PulsaPage pulsaPage;

    @And("^The user change the product to (.*)$")
    public void theUserChangeTheAmountToAmount(String productName) {
        pulsaPage.selectProduct(productName);
    }
}
