package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private final WebDriver driver;

    private final String linkXpath_Format = ".//a[contains(text(), '1')]";
    private final By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }
}
