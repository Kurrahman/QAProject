package future.phase2.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Checkout1Page extends PageObject {
    @FindBy(xpath = "//span[@class='payment__cart-preview-summary__msisdn']")
    private WebElementFacade handphoneNumber;

    @FindBy(xpath = "//span[@class='payment__cart-preview-summary__title']")
    private WebElementFacade productName;

    @FindBy(xpath ="//button[@class='payment__buyNow']")
    private WebElementFacade payBtn;

    public String getHandphoneNumber(){
        return handphoneNumber.getText().substring(13);
    }

    public String getProductName(){
        return productName.getText();
    }

    public void payNow(){
        payBtn.click();
    }

    public boolean buttonVisible(){
        return payBtn.isVisible();
    }
}
