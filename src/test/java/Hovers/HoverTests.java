package Hovers;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest {
    @Test
    public void testHover(){
        var hover=homePage.hoverPage();
        var figureCaption=hover.hoverOverFigure(2);
        Assert.assertTrue((figureCaption.isCaptionDisplayed()),"Caption didnot displyed");
        Assert.assertEquals(figureCaption.getName(),"name: user2");
        Assert.assertEquals(figureCaption.getLinkText(),"View profile");
        Assert.assertTrue(figureCaption.getlink().endsWith("/users/2"));
    }
}
