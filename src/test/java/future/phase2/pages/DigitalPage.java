package future.phase2.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("https://www.blibli.com/digital/p/pulsa")
public class DigitalPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Masuk')]")
    private WebElementFacade loginBtn;

    @FindBy(xpath = "//input[@placeholder='Masukkan email']")
    private WebElementFacade emailInput;

    @FindBy(xpath = "//input[@placeholder='Masukkan kata sandi'")
    private WebElementFacade passwordInput;

    @FindBy(xpath = "//button[@class='button-submit'")
    private WebElementFacade loginSubmitBtn;

    @FindBy(xpath = "//div[@class='tab__item-box'")
    private List<WebElementFacade> tabItem;

    @FindBy(xpath = "//button[@id='btn-paynow'")
    private WebElementFacade checkoutBtn;

    public void login(String email, String password){
        loginBtn.click();
        emailInput.waitUntilVisible();
        emailInput.type(email);
        passwordInput.type(password);
        loginSubmitBtn.click();
    }

    public void checkout(){
        checkoutBtn.click();
    }
}
