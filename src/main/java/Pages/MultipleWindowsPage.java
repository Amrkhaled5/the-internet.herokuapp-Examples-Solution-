package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By link=By.xpath("//div[@id=\"content\"]/div/a");

    public MultipleWindowsPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickNewWindoLink(){
        driver.findElement(link).click();
    }

    public void navigateToNewWindo(){
        String originalWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public boolean checkCurrentURL(){
        return driver.getCurrentUrl().contains("windows/new");
    }
}
