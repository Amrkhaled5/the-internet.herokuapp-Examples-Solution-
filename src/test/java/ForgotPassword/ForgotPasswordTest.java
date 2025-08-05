package ForgotPassword;

import Pages.ForgotPasswordPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void forgotPasswordTest(){
        ForgotPasswordPage forgotPasswordPage=homePage.forgotPasswordPage();

        forgotPasswordPage.enterEmail("asd@gmail.com");
        forgotPasswordPage.clickRecivePasswordButton();
        Assert.assertTrue(forgotPasswordPage.checkErrorMsgContent());
    }
}
