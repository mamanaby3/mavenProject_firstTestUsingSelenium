package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

/**
 * Permet de configurer l'execution suivant le navigateur
 */
public class BrowserFactory
{

    static WebDriver factoryDriver;
    private static final HashMap<String, String> configurationMap = PropertiesFile.read("src/test/resources/environnement/config.properties");
    static String webBrowserType = configurationMap.get("browser");
    public static WebDriver getFactoryDriver()
    {
        switch (webBrowserType)
        {
            case "chrome" :
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                factoryDriver = new ChromeDriver();
                break;

            case "ie" :
                break;

            case "firefox" :
                break;

            default:
                break;
        }

        return factoryDriver;
    }


}


/*
Le modules "utils" permet de stocker tout ce qui est fonctions ou methodes reutilisables
 */