package KeyPresses;

import Pages.KeyPressesPage;
import base.BaseTest;
import org.checkerframework.checker.units.qual.K;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest {
    @Test
    public void keyPressTest(){
        KeyPressesPage keyPressesPage=homePage.keyPressesPage();
        keyPressesPage.PressKey("enter");
        Assert.assertTrue(keyPressesPage.checkResultMsg("enter"));
    }
}
