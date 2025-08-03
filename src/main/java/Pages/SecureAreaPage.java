package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage {
    private WebDriver driver;
    private By welcomeMessage =By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }

    public String getTest(){
        return driver.findElement(welcomeMessage).getText();
    }
}
