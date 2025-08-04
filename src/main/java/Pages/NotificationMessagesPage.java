package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagesPage {
    private WebDriver driver;
    private By reloadLink=By.xpath("//a[normalize-space()='Click here']");
    private By alertBox=By.id("flash-messages");
    private By Msg=By.id("flash");

    public NotificationMessagesPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickReloadLink(){
        driver.findElement(reloadLink).click();
    }

    public boolean checkMessagesdisplay(){
        return driver.findElement(alertBox).isDisplayed();
    }

    public boolean checkSuccessfulMessageContent(){
        return driver.findElement(Msg).getText().toLowerCase().contains("successful");
    }

    public boolean checkUnSuccessfulMessageContent(){
        return driver.findElement(Msg).getText().toLowerCase().contains("unsuccessful");
    }
}
