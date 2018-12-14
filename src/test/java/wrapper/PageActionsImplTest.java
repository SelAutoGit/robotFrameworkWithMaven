package wrapper;

import driver.DriverImpl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PageActionsImplTest {

    @Test
    public void testOpen() {
        new DriverImpl().driverInit();
        PageActions pageActions = new PageActionsImpl();
        ((PageActionsImpl) pageActions).setPageTimeOut(20);
        System.out.println(PageActionsImpl.pageLoadTime);
        pageActions.open("http://store.demoqa.com");

    }
}