package esp.dic2.softarchitecture.finalproject.configs;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Properties configProperties;
    private final String basePath = "/src/main/java/resources/config.properties";

    protected ConfigurationManager() {
        System.out.println(FileManager.getInstance().getAbsolutePath());
        String currentPath = FileManager.getInstance().getAbsolutePath()+basePath;
        configProperties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(currentPath);
            configProperties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) instance = new ConfigurationManager();
        return instance;
    }

    public String getConfigValue(String key) {
        return configProperties.getProperty(key);
    }
}
