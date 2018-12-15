package wrapper;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface Actions {
    public void click(String elementName);

    void simpleClick(String elementName);

    public WebElement findElement(String elementName);
    public List<WebElement> findElements(String elementName);
    public String getText(WebElement webElement);
    public void moveToElement(String elementName);
}
