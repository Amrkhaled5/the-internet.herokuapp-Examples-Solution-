package EntryAd;

import Pages.EntryAdPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryAdTest extends BaseTest {

    @Test
    public void entryAdTest(){
        EntryAdPage entryAdPage=homePage.entryAdPage();
        Assert.assertTrue(entryAdPage.checkAddDisplay());
    }

}
