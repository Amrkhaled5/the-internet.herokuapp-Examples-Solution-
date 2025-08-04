package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By Paragraphs=By.xpath("//div[@class=\"jscroll-inner\"]/div");

    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }

    public void gotoInfiniteScroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        int currentY = 0;
        int step = 200;
        int targetY = 6000;

        while (currentY < targetY) {
            js.executeScript("window.scrollTo(0, arguments[0]);", currentY);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentY += step;
        }
        js.executeScript("window.scrollTo(0, arguments[0]);", targetY);
    }

    public int getNumberOfParagraphs(){
        List<WebElement> paragraphs=driver.findElements(Paragraphs);
        return paragraphs.size();
    }

}
