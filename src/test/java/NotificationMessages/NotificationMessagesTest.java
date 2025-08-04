package NotificationMessages;

import Pages.NotificationMessagesPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends BaseTest {
    @Test
    public void notificationMessagesTest(){
        NotificationMessagesPage notificationMessagesPage=homePage.notificationMessagesPage();

        notificationMessagesPage.clickReloadLink();
        Assert.assertTrue(notificationMessagesPage.checkSuccessfulMessageContent());
        notificationMessagesPage.clickReloadLink();
        Assert.assertTrue(notificationMessagesPage.checkUnSuccessfulMessageContent());
    }
}
