package ConfigData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import tests.FilterByCountryTest;
import tests.FilterByLanguageTest;

public class ConfigProperties {

    protected static Properties ConfigDataProperties;
    public static final String ConfigData_CONFIG_PATH = System.getProperty("user.dir")+"/"+"src/main/config/ConfigData.properties";


    public static void ReadConfigDataProperties() throws IOException {

        Properties ConfigDataProperties = new Properties();
        FileInputStream file = new FileInputStream(ConfigData_CONFIG_PATH);
        ConfigDataProperties.load(file);
        System.out.println(ConfigDataProperties.getProperty("Language"));
        System.out.println(ConfigDataProperties.getProperty("Country"));
        FilterByLanguageTest.language =ConfigDataProperties.getProperty("Language");
        FilterByCountryTest.Country =ConfigDataProperties.getProperty("Country");
        System.out.println(ConfigDataProperties.getProperty("Language"));
        System.out.println(ConfigDataProperties.getProperty("Country"));

    }

}
