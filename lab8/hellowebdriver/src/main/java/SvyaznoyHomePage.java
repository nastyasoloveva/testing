import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SvyaznoyHomePage  extends AbstractPage  {
    private static final String HOMEPAGE_URL = "https://www.svyaznoy.travel/";
    private static final String SEARCH_BUTTON_XPATH="//*[@id='root']/div[1]/div[1]/button";

    @FindBy(xpath=SEARCH_BUTTON_XPATH)
    private WebElement searchButton;

    protected SvyaznoyHomePage(WebDriver driver) {
        super(driver);
    }

    public SvyaznoyHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }
    public SvyaznoyResultPage clickOnSearchButton(){
        searchButton.click();
        return new SvyaznoyResultPage(driver);
    }


}
