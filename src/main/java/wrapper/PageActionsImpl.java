package wrapper;

import driver.Driver;
import driver.DriverImpl;
import org.openqa.selenium.WebDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PageActionsImpl implements PageActions {
    private WebDriver driver = DriverImpl.driver;
    public static int pageLoadTime = 10;
    @Override
    public void open(String url) {
        driver.manage().timeouts().pageLoadTimeout(pageLoadTime, SECONDS);
        driver.get(url);
    }

    public void setPageTimeOut(int time){
        this.pageLoadTime= time;
    }
}
