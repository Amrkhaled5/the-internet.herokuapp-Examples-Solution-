package Pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basic_AuthPage {
    private WebDriver driver;
    private By successMsgContent=By.xpath("//div[@id=\"content\"]/div/p");

    public Basic_AuthPage(WebDriver driver){
        this.driver=driver;
    }

//    public void clickCancelAlert(){
//        Alert alert=driver.switchTo().alert();
//        alert.dismiss();
//    }
//
//    public void enterDatainAlert(String usernaem,String password){
//        Alert alert=driver.switchTo().alert();
//        alert.sendKeys();
//    }

    public boolean checkSuccessmsg(){
        return driver.findElement(successMsgContent).getText().contains("Congratulations!");
    }
}
