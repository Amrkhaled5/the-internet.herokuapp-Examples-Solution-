package DisappearingElements;

import Pages.DisappearingElementsPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearingElementsTest extends BaseTest {
    @Test
    public void DisappearingElementstest(){
        DisappearingElementsPage disappearingElementsPage=homePage.disappearingElementsPage();
        // Try until it true as there is button disapper sometimes
        Assert.assertTrue(disappearingElementsPage.checkAllButtonsApper());
    }
}
