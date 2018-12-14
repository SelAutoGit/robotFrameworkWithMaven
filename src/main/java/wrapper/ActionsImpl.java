package wrapper;

import driver.DriverImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class ActionsImpl implements Actions {
    private static final Logger logger = LogManager.getLogger(ActionsImpl.class);
    private final int timeOutInSeconds = 30;

    @Override
    public void click(String xpath) {
        try{
             (new WebDriverWait(DriverImpl.driver, timeOutInSeconds))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

        }catch (Exception e){
            logger.error("The element can't be found bc of " + e.getMessage());
            WebDriver augmentedDriver = new Augmenter().augment(DriverImpl.driver);
            File screenshot = ((TakesScreenshot)augmentedDriver).
                    getScreenshotAs(OutputType.FILE);

        }
    }

    @Override
    public WebElement findElement(String xpath) {
        try{
            WebElement element = (new WebDriverWait(DriverImpl.driver, timeOutInSeconds))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            return element;
        }catch (Exception e){
            logger.error("The element can't be found bc of " + e.getMessage());
            WebDriver augmentedDriver = new Augmenter().augment(DriverImpl.driver);
            File screenshot = ((TakesScreenshot)augmentedDriver).
                    getScreenshotAs(OutputType.FILE);
            return null;
        }

    }

    @Override
    public List<WebElement> findElements(String xpathLocator) {
        return null;
    }

    @Override
    public String getText(WebElement webElement) {
        return null;
    }
}
