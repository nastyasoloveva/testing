import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SvyaznoyResultPage {
    private static final String RESULT_XPATH = "https://www.svyaznoy.travel/#MSQ0102/MOW/A1/C0/I0/S0";
    public By getResultAvia = By.xpath("//*[@id='root']/div[3]");

    public SvyaznoyResultPage(WebDriver driver) {

    }
}
