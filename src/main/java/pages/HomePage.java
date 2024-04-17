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
        clickLink("a[href='/key_presses']");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("a[href='/javascript_alerts']");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("a[href='/upload']");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("a[href='/tinymce']");
        return new WysiwygEditorPage(driver);
    }

    private void clickLink(String cssSelector){
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("a[href='/dynamic_loading']");
        return new DynamicLoadingPage(driver);
    }

    public MultipleWindowPage clickMultipleWindows(){
        clickLink("a[href='/windows']");
        return new MultipleWindowPage(driver);
    }


    public LargeAndDeepDomPage clickLargeAndDEppDom(){
        clickLink("a[href='/large']");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("a[href='/infinite_scroll']");
        return new InfiniteScrollPage(driver);
    }

     /*=====================================
       METHODS FOR INDIVIDUAL EXERCISES
     ======================================*/

    public ContextMenuPage clickContextMenu(){
        clickLink("a[href='/context_menu']");
        return new ContextMenuPage(driver);
    }

}

