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
        By searchErrorfield=By.xpath("//*[@id='root']/div[1]/div/div[2]/div[1]/div[1]");
        Assert.assertNotNull(driver.findElements(searchErrorfield));


        Thread.sleep(2000);
        driver.quit();

    }
}
