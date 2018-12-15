package keywords;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RobotGUIKeywordsTest {

    @Test(enabled = false)
    public void testOpen() {
        System.setProperty("log4j.configurationFile","C:\\Users\\Yuting\\workspace\\demo\\conf\\log4j2.xml");
        RobotGUIKeywords robotGUIKeywords=new RobotGUIKeywords();
        robotGUIKeywords.find("HomePage.Tab.ProductCategory");
    }

}