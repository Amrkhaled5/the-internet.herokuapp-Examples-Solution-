package HorizontalSlider;

import Pages.HorizontalSliderPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest {
    @Test
    public void horizontalSliderTest(){
        HorizontalSliderPage horizontalSliderPage=homePage.horizontalSliderPage();

        horizontalSliderPage.gotoHorizontalSlider();
        Assert.assertTrue(horizontalSliderPage.checkSliderValue());
    }
}
