package Pages.FormAuthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormAuthenticationPage {
    private WebDriver driver;
    private By userNameField=By.id("username");
    private By passwordField=By.id("password");
    private By msgBox=By.id("flash-messages");
    private By messageBoxContent=By.id("flash");
    private By logoutButton=By.xpath("//a[@class='button secondary radius']");
    private By loginButton=By.xpath("//i[@class='fa fa-2x fa-sign-in']");

    public FormAuthenticationPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean checkURL(String CorrectURL){
        return driver.getCurrentUrl().equals(CorrectURL);
    }

    public void enterUserNameAndPassword(String name,String pass){
        driver.findElement(userNameField).sendKeys(name);
        driver.findElement(passwordField).sendKeys(pass);
    }

    public boolean checkErrorMsgDisplay(){
        return driver.findElement(msgBox).isDisplayed();
    }

    public boolean checkErrorMsgContent(String error){
        return driver.findElement(messageBoxContent).getText().contains(error);
    }

    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


}
