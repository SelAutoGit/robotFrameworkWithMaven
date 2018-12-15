package wrapper;

import driver.ChromeDriverImpl;
import objectRepo.ObjectProcessor;
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
    public void click(String elementName) {
        try{
            logger.info("Trying to click element " + elementName + " with xpath " +ObjectProcessor.object.getProperty(elementName));
             (new WebDriverWait(ChromeDriverImpl.driver, timeOutInSeconds))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(ObjectProcessor.object.getProperty(elementName)))).click();

        }catch (Exception e){
            logger.error("The element can't be found bc of " + e.getMessage());
            WebDriver augmentedDriver = new Augmenter().augment(ChromeDriverImpl.driver);
            File screenshot = ((TakesScreenshot)augmentedDriver).
                    getScreenshotAs(OutputType.FILE);

        }
    }



    @Override
    public void simpleClick(String elementName){
        logger.info("Trying to click element " + elementName + " with xpath " +ObjectProcessor.object.getProperty(elementName));

    }

    @Override
    public WebElement findElement(String elementName) {
        try{
            logger.info("Trying to locate element " + elementName + " with xpath " +ObjectProcessor.object.getProperty(elementName));
            WebElement element = (new WebDriverWait(ChromeDriverImpl.driver, timeOutInSeconds))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectProcessor.object.getProperty(elementName))));
            return element;
        }catch (Exception e){
            logger.error("The element can't be found bc of " + e.getMessage());
            WebDriver augmentedDriver = new Augmenter().augment(ChromeDriverImpl.driver);
            File screenshot = ((TakesScreenshot)augmentedDriver).
                    getScreenshotAs(OutputType.FILE);
            return null;
        }

    }

    public void moveToElement(String elementName){
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(ChromeDriverImpl.driver);
        WebElement targetElement = findElement(elementName);
        actions.moveToElement(targetElement).moveToElement(targetElement).build().perform();
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
