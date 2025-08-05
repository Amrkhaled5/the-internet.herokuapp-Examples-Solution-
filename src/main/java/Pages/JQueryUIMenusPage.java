package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class JQueryUIMenusPage{
    private WebDriver driver;
    private By menu=By.xpath("//ul[@id=\"menu\"]/li");
    Actions actions = new Actions(driver);

    public JQueryUIMenusPage(WebDriver driver){
        this.driver=driver;
    }

    public void hoverAndGetLastSubmenuData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        List<WebElement> menuItems = driver.findElements(menu);
        System.out.println(menuItems.get(0)+"  sadasd");
        WebElement lastItem = menuItems.get(menuItems.size() - 1);
        actions.moveToElement(lastItem).perform();

        WebElement submenu = wait.until(ExpectedConditions.visibilityOf(
                lastItem.findElement(By.id("ui-id-3"))
        ));

        List<WebElement> submenuItems = submenu.findElements(By.tagName("li"));
        for (WebElement item : submenuItems) {
            System.out.println("Submenu item: " + item.getText());
        }
    }
    public String getLastElementData() {

            WebElement mainMenu = driver.findElement(By.id("ui-id-3"));
            actions.moveToElement(mainMenu).perform();

            WebElement subMenu = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("ul[aria-expanded='true'][style*='display: block']")
                    )
            );

            // Step 4: Find all menu items in the submenu
            List<WebElement> subMenuItems = subMenu.findElements(
                    By.cssSelector("li.ui-menu-item[role='menuitem']")
            );

            if (subMenuItems.isEmpty()) {
                return "No submenu items found";
            }

            // Step 5: Get the last element
            WebElement lastElement = subMenuItems.get(subMenuItems.size() - 1);

            // Step 6: Hover over the last element to reveal its submenu (if any)
            actions.moveToElement(lastElement).perform();

            // Step 7: Wait a moment for any nested menu to appear
            Thread.sleep(500);

            // Step 8: Check if there's a nested submenu for the last element
            List<WebElement> nestedMenus = driver.findElements(
                    By.cssSelector("ul[aria-expanded='true'][aria-hidden='true']")
            );

            if (!nestedMenus.isEmpty()) {
                // If there's a nested menu, get its items
                WebElement nestedMenu = nestedMenus.get(nestedMenus.size() - 1);
                List<WebElement> nestedItems = nestedMenu.findElements(
                        By.cssSelector("li.ui-menu-item")
                );

                if (!nestedItems.isEmpty()) {
                    WebElement lastNestedItem = nestedItems.get(nestedItems.size() - 1);
                    return lastNestedItem.getText();
                }
            }

             return lastElement.getText();
        }
    }
}
