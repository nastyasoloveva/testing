
package page;

import org.openqa.selenium.WebDriver;

public class SvyaznoyHotelPage extends AbstractPage {
   public static final String HOTEL_XPATH="https://hotels.svyaznoy.travel/?sid=41fd7288-3ac3-45d5-9851-38bfc1539c9d";
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public SvyaznoyHotelPage(WebDriver driver) {
        super(driver);
    }
}
