import org.testng.Assert;
import org.testng.annotations.Test;
import page.SvyaznoyBusPage;
import page.SvyaznoyHomePage;
import page.SvyaznoyHotelPage;
import page.SvyaznoyResultPage;

public class SvyaznoyHomePageTest extends CommonConditions{

    @Test
    public void testHighlightingUncompletedFieldsInRed()  {

        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.clickOnSearchButton();
        Assert.assertNotNull(svyaznoyHomePage.findElementOnPage(svyaznoyHomePage.getField));
    }
    @Test
    public void testFindAviaTickets() {

        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.inputDate("01.02.2022");
        svyaznoyHomePage.inputWhere("Москва");
        svyaznoyHomePage.clickOnSearchButton();
        SvyaznoyResultPage svyaznoyResultPage = new SvyaznoyResultPage(driver);
        Assert.assertNotNull(svyaznoyResultPage.findElementOnPage(svyaznoyResultPage.getResultAvia));

    }
    @Test
    public void testClickOnHotel() throws InterruptedException{
        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.clickOnHotel();
        SvyaznoyHotelPage svyaznoyHotelPage = new SvyaznoyHotelPage(driver);
        Thread.sleep(2500);
        String url = svyaznoyHotelPage.getCurrentUrl();
        Assert.assertTrue(url.contains("hotels"));
    }
    @Test
    public void testClickOnBus() throws InterruptedException{
        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.clickOnBus();
        SvyaznoyBusPage svyaznoyBusPage = new SvyaznoyBusPage(driver);
        Thread.sleep(2500);
        String url = svyaznoyBusPage.getCurrentUrl();
        Assert.assertTrue(url.contains("bus"));
    }
}
