package wrapper;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface WebTable {
    public WebElement getTable(String elementName);
    public int getRowNumber(String elementName);
    public int getColumnNumber(String elementName);
    public WebElement getRow(int rowNum);
    public WebElement getColumn(int ColumnNum);
    public List<WebElement> getRows(int start, int end);
    public List<WebElement> getColumns(int start, int end);
}
