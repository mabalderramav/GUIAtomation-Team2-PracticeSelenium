package org.fundacionjala.practiceSelenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 */
public class Environment {

    private static final String CONFIG = "config.properties";

    private static Environment environment;

    private Properties properties;

    private Environment() {
        File file = new File(CONFIG);
        try (FileReader fileReader = new FileReader(file)) {
            properties = new Properties();
            properties.load(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Environment getInstance() {
        if (environment == null) {
            environment = new Environment();
        }
        return environment;
    }

    public String getEnv(String env) {
        return properties.getProperty(env);
    }

    public String getBaseUri() {
        return getEnv("baseUrl");
    }

    public String getUserName() {
        return getEnv("userName");
    }

    public String getPassword() {
        return getEnv("password");
    }
    public int getTimeout(){
        return Integer.parseInt(getEnv("timeout"));
    }
}