package future.phase2.pages;

import com.ibm.icu.impl.UResource;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

import java.util.List;

@DefaultUrl("https://www.blibli.com/digital/p/pulsa")
public class PulsaPage {

    @FindBy(xpath = "//input[@class='form__input']")
    private WebElementFacade formHandphone;

    @FindBy(xpath = "//div[@class='select-product']")
    private List<WebElementFacade> products;

    @FindBy(xpath = "//a[contains(text(),'Paket Data')]")
    private WebElementFacade paketDataBtn;

    @FindBy(xpath = "//a[contains(text(),'Pulsa')]")
    private WebElementFacade pulsaBtn;

    public void fillNumber(String number){
        formHandphone.type(number);
    }

    public void changeToPaketData(){
        paketDataBtn.click();
    }

    public void changeToPulsa(){
        pulsaBtn.click();
    }

    public void selectProduct(String productName){
        for (WebElementFacade product:
             products) {
            if (product.getText().contains(productName)){
                product.click();
                return;
            }
        }
    }

    public void changeInputNumber(int ndigit, int position, String change){
        formHandphone.click();
        formHandphone.sendKeys(Keys.HOME);
        for (int i = 0; i < position; i++) {
            formHandphone.sendKeys(Keys.ARROW_RIGHT);
        }
        for (int i = 0; i < ndigit; i++) {
            formHandphone.sendKeys(Keys.DELETE);
        }
        formHandphone.sendKeys(change);
    }
}
