package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Link=By.xpath("//a[normalize-space()='Example 1: Element on page that is hidden']");
    private By startBtn=By.xpath("//button[normalize-space()='Start']");
    private By loadingBar=By.id("loading");
    private By  helloWorldMsg=By.id("finish");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickExample1Link(){
        driver.findElement(example1Link).click();
    }
    public void clickStartLink(){
        driver.findElement(startBtn).click();
    }

    public boolean checkLoadingBarApper(){
        return driver.findElement(loadingBar).isDisplayed();
    }

    public  boolean checkHeeloWorldMsgApper(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));
        return driver.findElement(helloWorldMsg).isDisplayed();
    }

}
