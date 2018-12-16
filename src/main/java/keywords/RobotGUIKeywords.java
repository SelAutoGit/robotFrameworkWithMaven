package keywords;

import driver.ChromeDriverImpl;
import objectRepo.ObjectProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import wrapper.Actions;
import wrapper.ActionsImpl;
import wrapper.PageActions;
import wrapper.PageActionsImpl;

public class RobotGUIKeywords {
    private static final Logger logger = LogManager.getLogger(RobotGUIKeywords.class);
    private String repoPath;
    private Actions actions;
    private PageActions pageActions;
    private ObjectProcessor objectProcessor;

    public void init(){
        new ChromeDriverImpl().driverInit();
        if (repoPath != null){
            objectProcessor = new ObjectProcessor(repoPath);
        }else {
            objectProcessor = new ObjectProcessor("objectRepo/MagicMouse.properties");
        }
        this.actions = new ActionsImpl();
        this.pageActions = new PageActionsImpl();
    };

    public void open (String url){
        pageActions.open(url);
    }

    public void close (){
        pageActions.close();
    }

    public void find(String elementName){
        actions.findElement(elementName);
    }

    public void click(String elementName){
        actions.click(elementName);
    }

    public void moveToElement (String elementName){actions.moveToElement(elementName);}

    public void setObjectRepoPath(String repoPath){
         this.repoPath = repoPath;
    }

    public void typeIn(String elementName, String value){
        actions.type(elementName,value);
    }

    public void select (String elementName, String option){
        actions.selectList(elementName, option);
    }

    public void validateElementText(String elementName, String expectedText){
        logger.info("Checking the Elment text showing on the GUI against Expected text");
        Assert.assertEquals(actions.findElement(elementName).getText(), expectedText);
    }

    public void validateElementPresence(String elementName){
        logger.info("Checking if the element is showing on the GUI");
        Assert.assertNotNull(actions.findElement(elementName));
    }




}
