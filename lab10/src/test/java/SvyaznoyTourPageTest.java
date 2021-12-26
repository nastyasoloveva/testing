import org.testng.Assert;
import org.testng.annotations.Test;
import page.SvyaznoyHomePage;
import page.SvyaznoyTourPage;

public class SvyaznoyTourPageTest extends CommonConditions{
    @Test
    public void testFindPesokInHotel() throws InterruptedException {
        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.clickOnTour();
        SvyaznoyTourPage svyaznoyTourPage = new SvyaznoyTourPage(driver);
        svyaznoyTourPage.clickOnCheckBoxPesok();
        Assert.assertNotNull(svyaznoyTourPage.findElementOnPage(svyaznoyTourPage.iconPesok));
    }
    @Test
    public void testLocateInFrance() throws InterruptedException {
        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.clickOnTour();
        SvyaznoyTourPage svyaznoyTourPage = new SvyaznoyTourPage(driver);
        Thread.sleep(2500);
        svyaznoyTourPage.chooseCountry("Франция");
        String country = svyaznoyTourPage.getTextOfPlace();
        Assert.assertTrue(country.contains("Франция"));
    }
}