package pages;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private final WebDriver driver;
    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromDropDown(String option) {
        Select dropdownElement = new Select(driver.findElement(dropdown));
        dropdownElement.selectByVisibleText(option);

    }

    public List<String> getSelectedOption(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    @Contract(" -> new")
    private @NotNull Select findDropDownElement() {
        return new Select(driver.findElement(dropdown));
    }
}
