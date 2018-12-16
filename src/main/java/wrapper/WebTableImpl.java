package wrapper;

import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTableImpl implements WebTable {
    @Override
    public WebElement getTable(String elementName) {
        return null;
    }

    @Override
    public int getRowNumber(String elementName) {
        return 0;
    }

    @Override
    public int getColumnNumber(String elementName) {
        return 0;
    }

    @Override
    public WebElement getRow(int rowNum) {
        return null;
    }

    @Override
    public WebElement getColumn(int ColumnNum) {
        return null;
    }

    @Override
    public List<WebElement> getRows(int start, int end) {
        return null;
    }

    @Override
    public List<WebElement> getColumns(int start, int end) {
        return null;
    }
}
