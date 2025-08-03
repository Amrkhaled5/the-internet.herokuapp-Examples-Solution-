package BasicAuth;

import Pages.Basic_AuthPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {
    @Test
    public void basicauthTest() {
        Basic_AuthPage basicAuthPage=homePage.basicAuthPage();
        Assert.assertTrue(basicAuthPage.checkSuccessmsg());
    }
}
