package Geolocation;

import Pages.GeolocationPage;
import base.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeolocationTest extends BaseTest {
    @Test
    public void geolocationTest() throws InterruptedException {

        GeolocationPage geolocationPage=homePage.geolocationPage();

        geolocationPage.clickWhereAmIButton();

        Assert.assertTrue(geolocationPage.checkMyLatitude());
        Assert.assertTrue(geolocationPage.checkMyLongitude());

    }
}
