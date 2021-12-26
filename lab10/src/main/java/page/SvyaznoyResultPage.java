package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SvyaznoyResultPage extends AbstractPage {
    private static final String RESULT_XPATH = "https://www.svyaznoy.travel/#MSQ0102/MOW/A1/C0/I0/S0";
    public By getResultAvia = By.xpath("//*[@id='root']/div[3]");

    public SvyaznoyResultPage(WebDriver driver) {
        super(driver);

    }
    public SvyaznoyResultPage findElementOnPage(By element){
        driver.findElements(By.id(String.valueOf(element)));
        return this;
    }
}
