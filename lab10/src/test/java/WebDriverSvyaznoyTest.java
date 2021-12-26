import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;



public class WebDriverSvyaznoyTest {
    private WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }
    @Test
    public void testHighlightingUncompletedFieldsInRed() throws InterruptedException {

        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.clickOnSearchButton();
        Assert.assertNotNull(driver.findElements(svyaznoyHomePage.getField));
        Thread.sleep(2000);
        driver.quit();

    }
    @Test
    public void testFindTickets() throws InterruptedException {

        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.inputDate("01.02.2022");
        svyaznoyHomePage.inputWhere("Москва");
        svyaznoyHomePage.clickOnSearchButton();
        SvyaznoyResultPage svyaznoyResultPage = new SvyaznoyResultPage(driver);
        Assert.assertNotNull(driver.findElements(svyaznoyResultPage.getResultAvia));
        Thread.sleep(2000);
        driver.quit();

    }
    @Test
    public void everyTourShouldContainsLocation() throws InterruptedException {
        SvyaznoyHomePage svyaznoyHomePage = new SvyaznoyHomePage(driver);
        svyaznoyHomePage.openPage();
        svyaznoyHomePage.clickOnTour();
        SvyaznoyTourPage svyaznoyTourPage = new SvyaznoyTourPage(driver);

    }

}
