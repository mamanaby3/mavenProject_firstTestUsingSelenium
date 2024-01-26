package modules;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.GoogleSearchPage;

import static utils.BrowserFactory.getFactoryDriver;

/**
 * Permet de mettre en place tous les modules ou les actions a faire
 * au debut ou a la fin de chaque scenario
 */
public class Hooks
{
    /*
    Definir le driver en "public static" permet de le reutiliser
    dans d'autres classes
     */
    public static WebDriver driver;

    private final GoogleSearchPage googleSearchPageObject = new GoogleSearchPage();

    /**
     * Represente les actions à axecuter avant chaque scenario de test
     */
    @Before
    public void setup()
    {

        driver = getFactoryDriver();


        /*
        Initialise les elements de la classe "GoogleSearchPage"
         */
        PageFactory.initElements(driver, googleSearchPageObject);
    }

    /**
     * Represente les actions à axecuter apres chaque scenario de test
     */
    @After
    public void tearDown()
    {
        driver.quit();

    }
}
