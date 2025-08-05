package JQueryUIMenus;

import Pages.JQueryUIMenusPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class JQueryUIMenusTest extends BaseTest {
    @Test
    public void jQueryUIMenuTest(){
        JQueryUIMenusPage jQueryUIMenusPage=homePage.jQueryUIMenusPage();
        jQueryUIMenusPage.hoverAndGetLastSubmenuData();
    }
}
