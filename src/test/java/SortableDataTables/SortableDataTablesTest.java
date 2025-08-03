package SortableDataTables;

import Pages.SortableDataTablesPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTablesTest extends BaseTest {
    @Test
    public void sortableDataTablesTest(){
        SortableDataTablesPage sortableDataTablesPage=homePage.sortableDataTablesPage();

        sortableDataTablesPage.clickDeleteButtonFirstTable();
        Assert.assertTrue(sortableDataTablesPage.checkDeleteURl());

        sortableDataTablesPage.clickEditButtonFirstTable();
        Assert.assertTrue(sortableDataTablesPage.checkEditURl());

        sortableDataTablesPage.clickDeleteForSpicificEmail("fbach@yahoo.com");
        Assert.assertTrue(sortableDataTablesPage.checkDeleteURl());
    }
}
