package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;

    private By figures=By.className("figure");
    private By figureCaption = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     *
     * @param index starts with index 1
     */
    public FigureCaptions hoverOverFigure(int index){
        WebElement figure =driver.findElements(figures).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaptions(figure.findElement(figureCaption));
    }

    public class FigureCaptions{
        private WebElement caption;
        private By header=By.tagName("h5");
        private By link=By.tagName("a");

        public FigureCaptions(WebElement caption){
            this.caption=caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getName(){
            return caption.findElement(header).getText();
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }

        public String getlink(){
            return caption.findElement(link).getAttribute("href");
        }

    }
}
