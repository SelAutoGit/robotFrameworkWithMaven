package wrapper;

import driver.ChromeDriverImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PageActionsImpl implements PageActions {
    private static final Logger logger = LogManager.getLogger(PageActionsImpl.class);
    private WebDriver driver = ChromeDriverImpl.driver;
    private static int pageLoadTime = 10;
    @Override
    public void open(String url) {
        try {
            logger.info("The page timeout is " + pageLoadTime);
            driver.manage().timeouts().pageLoadTimeout(pageLoadTime, SECONDS);
            driver.get(url);
        } catch (Exception e){
            logger.error("There is prob to open page " + url);
        }

    }

    public void setPageTimeOut(int time){
        this.pageLoadTime= time;
        logger.info("The page timeout time is setting to " + time);
    }
}
