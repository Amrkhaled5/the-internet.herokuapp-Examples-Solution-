package StatusCodes;

import Pages.StatusCodesPages.StatusCodesPage;
import Pages.StatusCodesPages.StatusCodesPage2;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StatusCodesTest extends BaseTest {

    @Test
    public void statusCodeTest(){
        String[] statusCodes = {"200", "301", "404", "500"};
        StatusCodesPage statusCodesPage = homePage.statusCodesPage();
        for(String code:statusCodes) {
            StatusCodesPage2 statusCodesPage2 = statusCodesPage.chooseStatusCode(code);
            Assert.assertTrue(statusCodesPage2.checkMsgContent(code),"Failed for status code:"+ code);
            statusCodesPage=statusCodesPage2.clickStatusCodePageLink();
        }
    }
}
