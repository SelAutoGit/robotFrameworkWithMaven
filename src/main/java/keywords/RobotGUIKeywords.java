package keywords;

import driver.ChromeDriverImpl;
import objectRepo.ObjectProcessor;
import wrapper.Actions;
import wrapper.ActionsImpl;
import wrapper.PageActions;
import wrapper.PageActionsImpl;

public class RobotGUIKeywords {
    private String repoPath;
    private Actions actions;
    private PageActions pageActions;
    private ObjectProcessor objectProcessor;
   /* public RobotGUIKeywords(){
        new ChromeDriverImpl().driverInit();
        if (repoPath != null){
            objectProcessor = new ObjectProcessor(repoPath);
        }else {
            objectProcessor = new ObjectProcessor("objectRepo/MagicMouse.properties");
        }
        this.actions = new ActionsImpl();
        this.pageActions = new PageActionsImpl();
    }*/

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




}
