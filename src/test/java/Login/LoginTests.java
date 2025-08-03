package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage=homePage.clickFromAuth();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureArea=loginPage.clicklogin();

        String text=secureArea.getTest();
        Assert.assertTrue(text.contains("You logged into a secure area!"),"The message is incorrect");

    }
}
