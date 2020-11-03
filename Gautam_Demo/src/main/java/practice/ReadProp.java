package main.java.practice;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp {

    public static Properties prop;
    static String propFileName = "file.properties";

    public static void main(String[] args){
        ReadProp readProp = new ReadProp();
        try(InputStream file1 = readProp.getClass().getClassLoader().getResourceAsStream(propFileName)) {
            prop  = new Properties();
            if (file1 != null) {
                prop.load(file1);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            System.out.println(prop.keySet());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFile(){

    }
}
