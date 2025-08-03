package DropDown;

import Pages.DropdownPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest extends BaseTest {
    @Test
    public void testSelctFromDroDown(){
        DropdownPage d=homePage.dropdownPage();
        d.selectFromDropDown("Option 2");
        List <String> selectedOption=d.getSlectedOptions();

        Assert.assertEquals(selectedOption.size(),1,"The message is incorrect");
        Assert.assertTrue(selectedOption.contains("Option 2"),"The message is incorrect");

    }
}
