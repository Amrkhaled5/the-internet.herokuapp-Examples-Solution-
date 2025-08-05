package Pages;

import Pages.FormAuthentication.FormAuthenticationPage;
import Pages.ShiftingContentPages.ShiftingContentPage;
import Pages.StatusCodesPages.StatusCodesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickFromAuth(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage dropdownPage(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoverPage hoverPage(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public AB_TestingPage ab_testingPage(){
        clickLink("A/B Testing");
        return new AB_TestingPage(driver);
    }

    public AddRemovePage addRemovePage(){
        clickLink("Add/Remove Elements");
        return new AddRemovePage(driver);
    }

    public Basic_AuthPage  basicAuthPage(){
        clickLink("Basic Auth");
        return new Basic_AuthPage(driver);
    }

    public BrokenImagesPage brokenImagesPage(){
        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }

    public CheckboxesPage checkboxesPage(){
        clickLink("Checkboxes");
        return new CheckboxesPage(driver);
    }

    public ContextMenuPage contextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DisappearingElementsPage disappearingElementsPage(){
        clickLink("Disappearing Elements");
        return new DisappearingElementsPage(driver);
    }

    public DragandDropPage dragandDropPage(){
        clickLink("Drag and Drop");
        return new DragandDropPage(driver);
    }

    public StatusCodesPage statusCodesPage(){
        clickLink("Status Codes");
        return new StatusCodesPage(driver);
    }

    public SortableDataTablesPage sortableDataTablesPage(){
        clickLink("Sortable Data Tables");
        return new SortableDataTablesPage(driver);
    }

    public ShiftingContentPage shiftingContentPage(){
        clickLink("Shifting Content");
        return new ShiftingContentPage(driver);
    }

    public InputsPage inputsPage(){
        clickLink("Inputs");
        return new InputsPage(driver);
    }

    public JavaScriptAlertsPage javaScriptAlertsPage(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public KeyPressesPage keyPressesPage(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public InfiniteScrollPage infiniteScrollPage(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public RedirectLinkPage redirectLinkPage(){
        clickLink("Redirect Link");
        return new RedirectLinkPage(driver);
    }

    public NotificationMessagesPage notificationMessagesPage(){
        clickLink("Notification Messages");
        return new NotificationMessagesPage(driver);
    }

    public NestedFramesPage nestedFramesPage(){
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    public MultipleWindowsPage multipleWindowsPage(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    public FormAuthenticationPage formAuthenticationPage(){
        clickLink("Form Authentication");
        return new FormAuthenticationPage(driver);
    }

    public ForgotPasswordPage forgotPasswordPage(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public JQueryUIMenusPage jQueryUIMenusPage(){
        clickLink("JQuery UI Menus");
        return new JQueryUIMenusPage(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
