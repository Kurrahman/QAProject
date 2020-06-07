package future.phase2.driver;

import net.thucydides.core.webdriver.DriverSource;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomChromeDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
