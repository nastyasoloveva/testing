import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SvyaznoyHomePage  extends AbstractPage  {
    private static final String HOMEPAGE_URL = "https://www.svyaznoy.travel/";
    private static final String SEARCH_BUTTON_XPATH="//*[@id='root']/div[1]/div[1]/button";
    private static final String CALENDER_PATH="//*[@id=\'root\']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/input";
    private static final String WHERE_PATH="//*[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/input";
    private static final String TOUR_PATH="//*[@id=\'root\']/div[1]/nav/a[5]";
    public By getField = By.xpath("//*[@id='root']/div[1]/div/div[2]/div[1]/div[1]");

    @FindBy(xpath=SEARCH_BUTTON_XPATH)
    private WebElement searchButton;

    @FindBy(xpath=CALENDER_PATH)
    private WebElement Date;

    @FindBy(xpath=WHERE_PATH)
    private WebElement Where;

    @FindBy(xpath=TOUR_PATH)
    private WebElement Tour;

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

    public SvyaznoyHomePage inputDate(String date){
        Date.sendKeys(date);
        return this;
    }
    public SvyaznoyHomePage inputWhere(String where){
        Where.sendKeys(where);
        return this;
    }
    public SvyaznoyResultPage clickOnTour(){
        Tour.click();
        return new SvyaznoyResultPage(driver);
    }
}
