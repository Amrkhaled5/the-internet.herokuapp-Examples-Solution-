package DragandDrop;

import Pages.DragandDropPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragandDropTest extends BaseTest {
    @Test
    public void DragandDroptest(){
        DragandDropPage dragandDropPage=homePage.dragandDropPage();
        dragandDropPage.dragandDrop();
        Assert.assertTrue(dragandDropPage.checkButtonSwitch());

    }
}
