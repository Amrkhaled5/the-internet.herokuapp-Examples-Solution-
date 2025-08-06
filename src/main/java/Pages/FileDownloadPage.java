package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileDownloadPage {
    private WebDriver driver;
    private By  notesDownloadLink=By.xpath("//a[contains(text(),'Notes.txt')]");

    public FileDownloadPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean checkFileDounloaded(String downloadPath, String expectedFileName){

        File folder = new File(downloadPath);
        File[] files = folder.listFiles();

        for (File file : files) {
            if (file.getName().contains(expectedFileName)) {
                return true;
            }
        }
        return false;
    }

    public void clickNotesDownloadLink(){
        driver.findElement(notesDownloadLink).click();
    }
}
