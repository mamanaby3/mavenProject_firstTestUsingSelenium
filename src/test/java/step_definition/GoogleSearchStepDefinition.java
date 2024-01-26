package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import static modules.Hooks.driver;
import static org.junit.Assert.assertTrue;
import static page_objects.GoogleSearchPage.searchFor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchStepDefinition {


    @Given("I open search page")
    public void iOpenSearchPage()
    {

        driver.get("https://www.google.com");

    }

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0)
    {
        searchFor(arg0);
    }


    @Then("search result display the word {string}")
    public void searchResultDisplayTheWord(String arg0)
    {

        assertTrue(driver.getTitle().contains(arg0));
    }
}

/*
Le package "step_definition" permettra d'implementer toutes
les etapes d'un scenario ou feature
 */
