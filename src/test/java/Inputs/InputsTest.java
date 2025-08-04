package Inputs;

import Pages.InputsPage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    @Test
    public void inputsTest(){
        InputsPage inputsPage=homePage.inputsPage();
        inputsPage.clickInputField();
        inputsPage.decreaseInputBy(4);
        inputsPage.increaseInputBy(10);
        Assert.assertTrue(inputsPage.checkEndResult("6"));
    }
}
