package Pages.ShiftingContentPages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageExamplePage {
    private WebDriver driver;
    private By img=By.xpath("//div[@id=\"content\"]/div/img");
    private By loadRandomPositionLink=By.xpath("//div[@id=\"content\"]/div/p[2]/a");
    private By shiftImageLink=By.xpath("//div[@id=\"content\"]/div/p[3]/a");
    private By bothActionsLink=By.xpath("//div[@id=\"content\"]/div/p[4]/a");
    private By changeImageLink=By.xpath("//div[@id=\"content\"]/div/p[5]/a");

    public ImageExamplePage (WebDriver driver){
        this.driver=driver;
    }

    public void clickLoadRandomPositionImage(){
        driver.findElement(loadRandomPositionLink).click();
    }

    public boolean checkImagePositionAfterClickShift(){
        int x = driver.findElement(img).getLocation().getX();
        int y = driver.findElement(img).getLocation().getY();
        int imgeOriginalPosition=x+y;
        driver.findElement(shiftImageLink).click();
        x = driver.findElement(img).getLocation().getX();
        y = driver.findElement(img).getLocation().getY();
        int imgeCurrentPosition=x+y;
        if (imgeCurrentPosition==imgeOriginalPosition)
            return false;
        return true;
    }

    public boolean checkImagePositionAfterClickboth(){
        int x = driver.findElement(img).getLocation().getX();
        int y = driver.findElement(img).getLocation().getY();
        int imgeOriginalPosition=x+y;
        driver.findElement(bothActionsLink).click();
        x = driver.findElement(img).getLocation().getX();
        y = driver.findElement(img).getLocation().getY();
        int imgeCurrentPosition=x+y;
        if (imgeCurrentPosition==imgeOriginalPosition)
            return false;
        return true;
    }

    public boolean checkImageChangeWhenClickChangeImage(){
        String originalSrc=driver.findElement(img).getAttribute("src");
        driver.findElement(changeImageLink).click();
        String currentlSrc=driver.findElement(img).getAttribute("src");

        if(originalSrc.equals(currentlSrc))
            return false;
        return true;
    }

}
