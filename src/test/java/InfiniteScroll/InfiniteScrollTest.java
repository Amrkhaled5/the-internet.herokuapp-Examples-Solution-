package InfiniteScroll;

import Pages.InfiniteScrollPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTest {
    @Test
    public void infiniteScrollTest() {
        InfiniteScrollPage infiniteScrollPage=homePage.infiniteScrollPage();

        infiniteScrollPage.gotoInfiniteScroll();
        Assert.assertEquals(17,infiniteScrollPage.getNumberOfParagraphs());
    }
}
