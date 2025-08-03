package AB_Testing;

import Pages.AB_TestingPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AB_Test extends BaseTest {
    @Test
    public void testContent(){
        AB_TestingPage abPage=homePage.ab_testingPage();

        Assert.assertTrue(abPage.checkTitleContent());
    }
}
