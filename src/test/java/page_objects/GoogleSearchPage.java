package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Permet de stocker tous les elements web de la page
 * que l'on utilisera lors du test
 */


public class GoogleSearchPage
{

    /**
     * Represente un element de la page qui interviendra lors du test
     */
    @FindBy(name = "q")
    private static WebElement searchBar;


    @FindBy(name = "btnK")
    private static WebElement btnSearch;
    /**
     * Definit pour un element de la page web, toutes les methodes qui lui sera
     * appliquées
     * @param keyWord Le mot à rechercher
     */
    public static void searchFor(String keyWord)
    {
        searchBar.click();
        searchBar.clear();
        searchBar.sendKeys(keyWord);
        btnSearch.click();
    }
}

/*
Nous servira de repository de nos elements de pages web
 */
