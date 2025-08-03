package ContextMenu;

import Pages.ContextMenuPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {
    @Test
    public void contextMenuTest() {
        ContextMenuPage contextMenuPage=homePage.contextMenuPage();
        contextMenuPage.clickRightClickOnTheBox();

        contextMenuPage.acceptAlert();

    }
}
