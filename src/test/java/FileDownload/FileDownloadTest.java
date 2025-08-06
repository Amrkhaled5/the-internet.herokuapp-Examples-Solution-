package FileDownload;

import Pages.FileDownloadPage;
import base.BaseTest;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FileDownloadTest extends BaseTest {

    @Test
    public void fileDownloadTest() throws InterruptedException {
        FileDownloadPage fileDownloadPage=homePage.fileDownloadPage();

        fileDownloadPage.clickNotesDownloadLink();
        Thread.sleep(3000);
        String downloadPath = "C:\\Users\\Amrkh\\Downloads";
        String expectedFileName = "Notes";

        Assert.assertTrue(fileDownloadPage.checkFileDounloaded(downloadPath, expectedFileName));
    }

}
