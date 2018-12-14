package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverImpl implements Driver {
    public static WebDriver driver;
    @Override
    public WebDriver driverInit() {
        return driver = new ChromeDriver();
    }

    @Override
    public WebDriver driverInit(String driverType) {
        return null;
    }
}
