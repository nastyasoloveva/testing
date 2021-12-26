package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SvyaznoyTourPage extends AbstractPage {
    private static final String TOUR_XPATH = "https://tours.svyaznoy.travel/search#?fromCity=2&toCountry=29&dateFrom=09.01.2022&dateTo=09.01.2022&nightFrom=7&nightTo=8&adults=2&hotelClass=all&meal=all&priceFrom=6000&priceTo=50000000&sid=3wz6nz43p4&sort=recommend";

    private By checkBoxPesok=By.xpath("//*[@id=\"forSearchView\"]/div[5]/div/div[7]/div[1]/div[1]/div[1]/div/ul/li[1]/label/div");
    public By iconPesok=By.xpath("//*[@id=\'hotelTemplate\']/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/i");
    private By filter=By.xpath("//*[@id='forSearchView']/div[5]/div/div[5]/div");
    private By Country=By.xpath("//*[@id=\'mainSearchForm\']/div[2]/div/div[1]/div/input");
    private By buttonSearch=By.xpath("//*[@id='startSearch']");
    public By fieldOfPlace=By.xpath("//*[@id=\'hotelTemplate\']/div[1]/div[1]/div[2]/div[1]/div[2]/a");
    private By buttonClose=By.xpath("//*[@id='mainSearchForm']/div[2]/div/div[1]/div/i[1]");


    public SvyaznoyTourPage clickOnCheckBoxPesok() throws InterruptedException {
        findElementAndClick(filter);
        Thread.sleep(2000);
        findElementAndClick(checkBoxPesok);
        findElementAndClick(filter);
        return this;
    }
    public SvyaznoyTourPage chooseCountry(String country) throws InterruptedException {
        findElementAndClick(Country);
        findElementAndClick(buttonClose);
        findElementAndClick(Country).sendKeys(country);
        Thread.sleep(2000);
        findElementAndClick(buttonSearch);
        Thread.sleep(2000);
        return this;
    }
    public SvyaznoyTourPage findElementOnPage(By element){
        driver.findElements(By.id(String.valueOf(element)));
        return this;
    }
   public String getTextOfPlace(){
     return findElementAndGetText(fieldOfPlace);
     }
    public SvyaznoyTourPage(WebDriver driver) {
        super(driver);
    }
}
