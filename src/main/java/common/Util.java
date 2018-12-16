package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {

    public static Properties loadPropertiesFile(String fileName) throws IOException {
        Properties obj = new Properties();
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "/" + fileName);
        obj.load(objfile);
        return obj;
    }
}
