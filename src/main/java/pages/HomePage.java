package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public WebDriver driver;
   // private final By fromAuthenticationLink = By.cssSelector("a[href='/login']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication() {
        clickLink("a[href='/login']");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("a[href='/dropdown']");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("a[href='/hovers']");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    private void clickLink(String cssSelector){
        driver.findElement(By.cssSelector(cssSelector)).click();
    }
}

