package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeolocationPage {
    private WebDriver driver;
    private By whereAmIButton=By.xpath("//div[@id=\"content\"]/div/button");
    private By Latitude=By.xpath("//div[@id='lat-value']");
    private By Longitude=By.xpath("//div[@id='long-value']");

    public GeolocationPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickWhereAmIButton(){
        driver.findElement(whereAmIButton).click();
    }

    public boolean checkMyLatitude(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Latitude));
        return driver.findElement(Latitude).getText().equals("30.1203456");
    }

    public boolean checkMyLongitude(){
        return driver.findElement(Longitude).getText().equals("31.342592");
    }



}
