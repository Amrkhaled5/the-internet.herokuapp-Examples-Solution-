package Pages;

import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TransferQueue;

public class FileUploadPage {
    private WebDriver driver;
    private By  chooseFileBtn=By.id("file-upload");
    private By  uploadBtn=By.id("file-submit");
    private By  fileNameData=By.id("uploaded-files");
    private By  uploadBox=By.id("drag-drop-upload");
    private By  filesNameInBox=By.xpath("//div[@class=\"dz-filename\"]/span");


    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickUpladBtn(){
        driver.findElement(uploadBtn).click();
    }
    public void clickUpladBox(){
        driver.findElement(uploadBox).click();
    }

    public void chooseFile(){
        String filePath = "C:/Users/Amrkh/Music/site.webp";
        driver.findElement(chooseFileBtn).sendKeys(filePath);
    }

    public boolean checkUploadedFileName(String fileName){
        return driver.findElement(fileNameData).getText().contains(fileName);
    }

    public void dragAndDropThreeFiles(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String jsCode =
                "var input = document.createElement('input');" +
                        "input.type = 'file';" +
                        "input.style.display = 'none';" +
                        "input.onchange = function(e) {" +
                        "  var event = new Event('drop', { bubbles: true });" +
                        "  event.dataTransfer = { files: this.files };" +
                        "  arguments[0].dispatchEvent(event);" +
                        "};" +
                        "document.body.appendChild(input);" +
                        "return input;";

        String [] filePaths={
                "C:/Users/Amrkh/Music/site.webp","C:/Users/Amrkh/Music/download.png","C:/Users/Amrkh/Music/food.jpg"
        };

        for (String path:filePaths){
            WebElement input = (WebElement) js.executeScript(jsCode, driver.findElement(uploadBox));
            input.sendKeys(path);
        }

    }

    public boolean checkFilesNameBox(){
        List<WebElement> files=driver.findElements(filesNameInBox);

        String [] filesName={"food","download","site"};
        for (String expectedName : filesName) {
            boolean found = false;
            for (WebElement file : files) {
                if (file.getText().contains(expectedName)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }




}
