package NestedFrames;

import Pages.NestedFramesPage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFramesTest extends BaseTest {


    @Test (priority = 0)
    public void nestedFramsTestTopLeft(){
        NestedFramesPage nestedFramesPage=homePage.nestedFramesPage();
        nestedFramesPage.goToNestedFrame("frame-top");
        nestedFramesPage.goToFramName("left");
        Assert.assertTrue(nestedFramesPage.checkFrameContent("left"));
        nestedFramesPage.switchToDefaultContent();

        nestedFramesPage.goToNestedFrame("frame-top");
        nestedFramesPage.goToFramName("right");
        Assert.assertTrue(nestedFramesPage.checkFrameContent("right"));
        nestedFramesPage.switchToDefaultContent();

        nestedFramesPage.goToNestedFrame("frame-top");
        nestedFramesPage.goToFramName("middle");
        Assert.assertTrue(nestedFramesPage.checkFrameContent("middle"));
        nestedFramesPage.switchToDefaultContent();

        nestedFramesPage.goToNestedFrame("frame-bottom");
        Assert.assertTrue(nestedFramesPage.checkFrameContent("bottom"));
        nestedFramesPage.switchToDefaultContent();
    }


}
