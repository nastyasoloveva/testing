
package page;

import org.openqa.selenium.WebDriver;

public class SvyaznoyBusPage extends AbstractPage {
    public static final String HOTEL_XPATH="https://www.svyaznoy.travel/bus/?_ga=2.157992120.302961066.1640539188-1690579220.1640535871";
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public SvyaznoyBusPage(WebDriver driver) {
        super(driver);
    }
}
