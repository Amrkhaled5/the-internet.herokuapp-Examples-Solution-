package Checkboxes;

import Pages.CheckboxesPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkboxesTest(){
        CheckboxesPage checkboxesPage=homePage.checkboxesPage();
        checkboxesPage.clickCheckBox(1);
        Assert.assertEquals(2,checkboxesPage.getNumberOfSelectedBoxes());
        checkboxesPage.clickCheckBox(2);
        checkboxesPage.clickCheckBox(1);
        Assert.assertEquals(0,checkboxesPage.getNumberOfSelectedBoxes());
    }
}
