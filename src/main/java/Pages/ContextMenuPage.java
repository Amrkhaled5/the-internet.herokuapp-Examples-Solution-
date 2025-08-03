package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By box=By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickRightClickOnTheBox()  {

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();
    }

    public void acceptAlert(){
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

}
