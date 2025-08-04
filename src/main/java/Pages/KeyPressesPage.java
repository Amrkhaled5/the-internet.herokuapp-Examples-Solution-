package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class KeyPressesPage {
    private WebDriver driver;
    private By result=By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }

    public void PressKey(String key){
        Actions action=new Actions(driver);
        if (key.equals("enter")) {
            action.sendKeys(Keys.ENTER).perform();
        }
        else if (key.equals("tab")) {
            action.sendKeys(Keys.TAB).perform();
        }
        else if (key.equals("shift")) {
            action.sendKeys(Keys.SHIFT).perform();
        }
        else if (key.equals("space")) {
            action.sendKeys(Keys.SPACE).perform();
        }
    }

    public boolean checkResultMsg(String correctMsg){
        return driver.findElement(result).getText().toLowerCase().contains(correctMsg);
    }



}
