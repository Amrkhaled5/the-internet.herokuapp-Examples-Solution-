package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;

    private By dropdown= By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver=driver;
    }

    public void selectFromDropDown(String option){
        getDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSlectedOptions(){
         List<WebElement> options=getDropDownElement().getAllSelectedOptions();
         List<String> optionsText =new ArrayList<>();
         for(WebElement e:options){
             optionsText.add(e.getText());
         }
         return optionsText;
    }

    public Select getDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
