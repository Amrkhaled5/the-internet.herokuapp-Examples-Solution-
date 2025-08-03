package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AB_TestingPage {
    private WebDriver driver;
    private By title=By.xpath("//div[@id=\"content\"]/div/h3");

    public AB_TestingPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean checkTitleContent(){
        return driver.findElement(title).getText().contains("A/B Test");
    }
}
