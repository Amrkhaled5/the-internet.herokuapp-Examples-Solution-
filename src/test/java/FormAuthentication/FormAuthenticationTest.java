package FormAuthentication;

import Pages.FormAuthentication.FormAuthenticationPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthenticationTest extends BaseTest {
    @Test
    public void formAuthenticationTest(){
        FormAuthenticationPage formAuthenticationPage=homePage.formAuthenticationPage();

        formAuthenticationPage.clickLoginButton();
        Assert.assertTrue(formAuthenticationPage.checkErrorMsgDisplay());
        Assert.assertTrue(formAuthenticationPage.checkErrorMsgContent("Your username is invalid!"));
        Assert.assertTrue(formAuthenticationPage.checkURL("https://the-internet.herokuapp.com/login"));

        formAuthenticationPage.enterUserNameAndPassword("tomsmith","SuperSecretPassword!");
        formAuthenticationPage.clickLoginButton();
        Assert.assertTrue(formAuthenticationPage.checkErrorMsgDisplay());
        Assert.assertTrue(formAuthenticationPage.checkErrorMsgContent("You logged into a secure area!"));
        Assert.assertTrue(formAuthenticationPage.checkURL("https://the-internet.herokuapp.com/secure"));

        formAuthenticationPage.clickLogout();
        Assert.assertTrue(formAuthenticationPage.checkURL("https://the-internet.herokuapp.com/login"));

    }
}
