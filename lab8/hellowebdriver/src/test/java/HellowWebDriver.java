import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class HellowWebDriver {

    @Test
    public void testHighlightingUncompletedFieldsInRed() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.svyaznoy.travel");
        By searchBthSelector=By.xpath("//*[@id='root']/div[1]/div/button");
        WebElement searchButton = driver.findElement(searchBthSelector);
        searchButton.click();
        By searchErrorfield=By.xpath("//*[@id='root']/div[1]/div/div[2]/div[1]/div[1]");
        Assert.assertNotNull(driver.findElements(searchErrorfield));

        Thread.sleep(2000);
        driver.quit();

    }
}
