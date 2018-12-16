package objectRepo;

import common.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

public class ObjectProcessor {
    private static final Logger logger = LogManager.getLogger(ObjectProcessor.class);
    public static Properties object;

    public ObjectProcessor(){};
    public ObjectProcessor(String objectRepoName){
        try {
            this.object = Util.loadPropertiesFile(objectRepoName);
        } catch (IOException e) {
            logger.error("There is prob to load properties file plz check if properties file availalbe " +e.getMessage());
        }
    }

    public String getElementLocator(String elementName){
        return object.getProperty(elementName);
    }

    public void setElementLocator(String elementName, String xpathValue){
        object.setProperty(elementName,xpathValue) ;
    }


}
