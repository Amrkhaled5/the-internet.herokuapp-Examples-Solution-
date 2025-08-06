package DynamicControls;

import Pages.DynamicControlsPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {
    @BeforeMethod
    public void get(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void dynamicContentTest1(){
        DynamicControlsPage dynamicControlsPage=homePage.dynamicControlsPage();

        dynamicControlsPage.clickCheckBoxBtn();
        Assert.assertTrue(dynamicControlsPage.checkBtnText("Remove",1));
        dynamicControlsPage.clickBtn(1);
        Assert.assertTrue(dynamicControlsPage.checkLoadingBarApper(1));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgApper(1));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgText(1));
        Assert.assertTrue(dynamicControlsPage.checkBtnText("Add",1));
    }
    @Test
    public void dynamicContentTest2(){
        DynamicControlsPage dynamicControlsPage=homePage.dynamicControlsPage();

        Assert.assertTrue(dynamicControlsPage.checkBtnText("Enable",2));
        dynamicControlsPage.clickBtn(2);
        Assert.assertTrue(dynamicControlsPage.checkLoadingBarApper(2));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgApper(2));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgText(2));
        Assert.assertTrue(dynamicControlsPage.checkInputFieldEnalbled());
        Assert.assertTrue(dynamicControlsPage.checkBtnText("Disable",2));
    }

}
