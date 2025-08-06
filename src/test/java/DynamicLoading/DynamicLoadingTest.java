package DynamicLoading;

import Pages.DynamicLoadingPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void dynamicLoadingTest(){
        DynamicLoadingPage dynamicLoadingPage=homePage.dynamicLoadingPage();

        dynamicLoadingPage.clickExample1Link();
        dynamicLoadingPage.clickStartLink();
        Assert.assertTrue(dynamicLoadingPage.checkLoadingBarApper());
        Assert.assertTrue(dynamicLoadingPage.checkHeeloWorldMsgApper());
    }
}
