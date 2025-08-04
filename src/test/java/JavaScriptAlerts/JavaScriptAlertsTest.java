package JavaScriptAlerts;

import Pages.JavaScriptAlertsPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends BaseTest {

    @Test
    public void javaScriptAlertTest(){
        JavaScriptAlertsPage javaScriptAlertsPage=homePage.javaScriptAlertsPage();

        javaScriptAlertsPage.clickJsAlertLink();
        javaScriptAlertsPage.acceptAlert();
        javaScriptAlertsPage.checkResultDisplay();
        Assert.assertTrue(javaScriptAlertsPage.checkResultContent("You successfully clicked an alert"));

        javaScriptAlertsPage.clickJsConfirmlink();
        javaScriptAlertsPage.acceptAlert();
        javaScriptAlertsPage.checkResultDisplay();
        Assert.assertTrue(javaScriptAlertsPage.checkResultContent("You clicked: Ok"));

        javaScriptAlertsPage.clickJsConfirmlink();
        javaScriptAlertsPage.rejectAlert();
        javaScriptAlertsPage.checkResultDisplay();
        Assert.assertTrue(javaScriptAlertsPage.checkResultContent("You clicked: Cancel"));

        javaScriptAlertsPage.clickJsPromptLink();
        javaScriptAlertsPage.enterDataInAlert("Amr Khaled");
        javaScriptAlertsPage.acceptAlert();
        javaScriptAlertsPage.checkResultDisplay();
        Assert.assertTrue(javaScriptAlertsPage.checkResultContent("You entered: Amr Khaled"));

        javaScriptAlertsPage.clickJsPromptLink();
        javaScriptAlertsPage.enterDataInAlert("Amr Khaled");
        javaScriptAlertsPage.rejectAlert();
        javaScriptAlertsPage.checkResultDisplay();
        Assert.assertTrue(javaScriptAlertsPage.checkResultContent("You entered: null"));


    }
}
