package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LargeAndDeepDOMPage {
    private WebDriver driver;
    private By table=By.id("large-table");
    private By lastElmentInTable=By.xpath("//tr[@class=\"row-50\"]/td[@class=\"column-50\"]");

    public LargeAndDeepDOMPage(WebDriver driver){
        this.driver=driver;
    }

    public void scrollToTable(){
        WebElement tableElement=driver.findElement(table);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        String script="arguments[0].scrollIntoView();";
        js.executeScript(script, tableElement);
    }

    public void scrollToTheEndOfTable(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollWidth, 0);");
    }

    public String getLasrElementInTable(){
        return driver.findElement(lastElmentInTable).getText();
    }

}
