package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FloatingMenuPage {
    private WebDriver driver;
    private By homeBtn=By.xpath("//a[@href='#home']");
    private By newsBtn=By.xpath("//a[@href='#news']");
    private By contactBtn=By.xpath("//a[@href='#contact']");
    private By about=By.xpath("//a[@href='#about']");

    public FloatingMenuPage(WebDriver  driver){
        this.driver=driver;
    }

    public void scrollToTheEnd(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void goToAnyPage(String page){
        switch (page){
            case "home":
                driver.findElement(homeBtn).click();
                break;
            case "news":
                driver.findElement(newsBtn).click();
                break;
            case "contact":
                driver.findElement(contactBtn).click();
                break;
            case "about":
                driver.findElement(about).click();
                break;
        }
    }
    public boolean checkURL(String page){
        return driver.getCurrentUrl().contains(page);
    }

}
