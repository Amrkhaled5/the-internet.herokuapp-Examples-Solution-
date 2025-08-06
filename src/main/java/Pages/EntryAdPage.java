package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    private WebDriver driver;
    private By restartAdBtn=By.id("restart-ad");
    private By adBox=By.xpath("//div[@class=\"modal\"]");

    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean checkAddDisplay(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(adBox));
        return driver.findElement(adBox).isDisplayed();
    }
}
