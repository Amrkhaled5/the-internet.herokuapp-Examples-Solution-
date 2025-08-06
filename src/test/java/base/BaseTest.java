package base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.List;

import static java.io.File.*;

public class BaseTest {
    protected HomePage homePage;
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
    }

//    @AfterMethod
//    public void takeScreenshot(ITestResult result){
//        if (ITestResult.FAILURE == result.getStatus()) {
//            var camera = (TakesScreenshot) driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try {
//                Files.move(screenshot.toPath(), new File("resources/screenshoot/" + result.getName() + ".png").toPath(), StandardCopyOption.REPLACE_EXISTING);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }


    @AfterClass
    public void sutdown(){
        driver.quit();
    }

}
