package driver;

import org.openqa.selenium.WebDriver;

public interface Driver {

    public  void driverInit();
    public  WebDriver driverInit(String driverType);
    public void driverTerminate();
}
