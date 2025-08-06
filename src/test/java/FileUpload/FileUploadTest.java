package FileUpload;

import Pages.FileUploadPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUploadTest() {
        FileUploadPage fileUploadPage=homePage.fileUploadPage();

        fileUploadPage.dragAndDropThreeFiles();
        fileUploadPage.checkFilesNameBox();

        fileUploadPage.chooseFile();
        fileUploadPage.clickUpladBtn();
        Assert.assertTrue(fileUploadPage.checkUploadedFileName("site"));




    }
}
