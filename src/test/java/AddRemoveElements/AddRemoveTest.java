package AddRemoveElements;

import Pages.AddRemovePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {
    int n=5;
    @Test
    public void checkAddDeletePage() {
        AddRemovePage addremovePage=homePage.addRemovePage();
        for(int i=0 ;i<n;i++) {
            addremovePage.clickAddElement();
        }
        Assert.assertEquals(5,addremovePage.getNumberOfDeleteButtons());

        for(int i=n-1 ;i>=2;i--) {
            addremovePage.clickDeleteButton(i);
        }
        Assert.assertEquals(2,addremovePage.getNumberOfDeleteButtons());
    }
}
