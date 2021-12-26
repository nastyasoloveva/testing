package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SvyaznoyHomePage  extends AbstractPage  {
    private static final String HOMEPAGE_URL = "https://www.svyaznoy.travel/";


    private By searchButton=By.xpath("//*[@id='root']/div[1]/div[1]/button");
    private By tour=By.xpath("//*[@id=\'root\']/div[1]/nav/a[5]");
    public By getField = By.xpath("//*[@id='root']/div[1]/div/div[2]/div[1]/div[1]");
    private By DateWhen=By.xpath("//*[@id=\'root\']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/input");
    private By Where=By.xpath("//*[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/input");
    private By Hotel=By.xpath("//*[@id=\'root\']/div[1]/nav/a[4]");
    private By Bus=By.xpath("//*[@id=\'root\']/div[1]/nav/a[3]");
    public SvyaznoyHomePage(WebDriver driver) {
        super(driver);
    }


    public SvyaznoyHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }
    public SvyaznoyHomePage clickOnSearchButton(){
        findElementAndClick(searchButton);
        return this;
    }

    public SvyaznoyHomePage inputDate(String date){
        findElementAndClick(DateWhen).sendKeys(date);
        return this;
    }
    public SvyaznoyHomePage inputWhere(String where){
        findElementAndClick(Where).sendKeys(where);
        return this;
    }
    public SvyaznoyHomePage clickOnTour(){
        findElementAndClick(tour);
        return this;
    }
    public SvyaznoyHomePage clickOnHotel(){
        findElementAndClick(Hotel);
        return this;
    }
    public SvyaznoyHomePage clickOnBus(){
        findElementAndClick(Bus);
        return this;
    }

    public SvyaznoyHomePage findElementOnPage(By element){
        driver.findElements(By.id(String.valueOf(element)));
        return this;
    }

}
