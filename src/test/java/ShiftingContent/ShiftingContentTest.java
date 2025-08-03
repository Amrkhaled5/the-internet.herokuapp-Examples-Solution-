package ShiftingContent;

import Pages.ShiftingContentPages.ImageExamplePage;
import Pages.ShiftingContentPages.ShiftingContentPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShiftingContentTest extends BaseTest {
    @Test
    public void ShiftingContenttest(){
        ShiftingContentPage shiftingContentPage=homePage.shiftingContentPage();
        ImageExamplePage imageExamplePage= shiftingContentPage.clickImglink();

        imageExamplePage.clickLoadRandomPositionImage();
        Assert.assertTrue(imageExamplePage.checkImagePositionAfterClickShift());
        Assert.assertTrue(imageExamplePage.checkImagePositionAfterClickboth());
        Assert.assertTrue(imageExamplePage.checkImageChangeWhenClickChangeImage());

    }
}
