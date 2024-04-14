package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUP(){
        System.setProperty("web-driver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); //Duration

        //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// TimeUnit

        goHome();

      /* 1 - Maximize the window
        driver.manage().window().maximize();

        2 - Full screen mode
        driver.manage().window().fullscreen();

        3 - Specific width (show Chrome iPhoneX emulator)
        driver.manage().window().setSize(size);

          System.out.println(driver.getTitle());
          */

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();;
    }
}
