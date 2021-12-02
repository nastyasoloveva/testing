import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SvyaznoyResultPage {
    private static final String RESULT_XPATH = "//*[@id='root']/div[1]/div/div[2]/div[1]/div[1]";

    @FindBy(xpath=RESULT_XPATH)
    public WebElement searchResults;

    public WebElement xpathResults(){

        return searchResults;
    }
    public SvyaznoyResultPage(WebDriver driver) {

    }
}
