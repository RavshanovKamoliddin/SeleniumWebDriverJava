package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public WebDriver driver;
    private final By fromAuthenticationLink = By.cssSelector("a[href='/login']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication() {
        driver.findElement(fromAuthenticationLink).click();
        return new LoginPage(driver);
    }
}

