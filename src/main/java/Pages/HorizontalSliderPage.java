package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider=By.xpath("//input[@type='range']");
    private By sliderValue=By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }

    public void gotoHorizontalSlider() {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(slider), 5, 0).build().perform();
    }

    public boolean checkSliderValue(){
        return driver.findElement(sliderValue).getText().equals("2.5");
    }
}
