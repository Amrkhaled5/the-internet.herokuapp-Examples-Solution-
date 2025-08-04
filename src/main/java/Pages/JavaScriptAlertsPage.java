package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By jsAlert=By.xpath("//button[@onclick=\"jsAlert()\"]");
    private By jsConfirm=By.xpath("//button[@onclick=\"jsConfirm()\"]");
    private By jsPrompt=By.xpath("//button[@onclick=\"jsPrompt()\"]");
    private By result =By.xpath("//p[@id='result']");

    public JavaScriptAlertsPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickJsAlertLink(){
        driver.findElement(jsAlert).click();
    }
    public void clickJsConfirmlink(){
        driver.findElement(jsConfirm).click();
    }
    public void clickJsPromptLink(){
        driver.findElement(jsPrompt).click();
    }
    public void acceptAlert(){
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    public void rejectAlert(){
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
    }
    public void enterDataInAlert(String data){
        Alert alert=driver.switchTo().alert();
        alert.sendKeys(data);
    }
    public boolean checkResultDisplay(){
        return driver.findElement(result).isDisplayed();
    }
    public boolean checkResultContent(String correctMsg){
        return driver.findElement(result).getText().equals(correctMsg);
    }


}
