package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverImpl implements Driver {
    public static WebDriver driver;

    @Override
    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @Override
    public WebDriver driverInit(String driverType) {
        return null;
    }

    @Override
    public void driverTerminate(){
        this.driver.close();
    }
}
