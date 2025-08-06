package FloatingMenu;

import Pages.FloatingMenuPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FloatingMenuTest extends BaseTest {
    private FloatingMenuPage floatingMenuPage;

    @BeforeClass
    public void setUpPage() {
        floatingMenuPage = homePage.floatingMenuPage();
    }
    
    @DataProvider(name = "pages")
    public Object[][] getData(){
        return new Object[][]{
                {"home"},{"about"},{"contact"},{"news"}
        };
    }

    @Test(dataProvider = "pages")
    public void floatMenuTest(String page){

        floatingMenuPage.goToAnyPage(page);
        Assert.assertTrue(floatingMenuPage.checkURL(page));
    }
}
