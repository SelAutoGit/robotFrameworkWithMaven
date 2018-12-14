package driver;

import org.openqa.selenium.WebDriver;

public interface Driver {
    public  WebDriver driverInit();
    public  WebDriver driverInit(String driverType);
}
