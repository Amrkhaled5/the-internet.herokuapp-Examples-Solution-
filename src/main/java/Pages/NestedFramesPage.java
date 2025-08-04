package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NestedFramesPage {
    private WebDriver driver;

    public NestedFramesPage(WebDriver driver){
        this.driver=driver;
    }

    public void goToFramName(String direction){
        driver.switchTo().frame("frame-"+direction);
    }

    public String getFrameText(){
        return driver.findElement(By.tagName("body")).getText();
    }

    public void goToNestedFrame(String frameName){
        driver.switchTo().frame(frameName);
    }

    public boolean checkFrameContent(String data){
        return getFrameText().toLowerCase().equals(data);
    }

    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }

}
