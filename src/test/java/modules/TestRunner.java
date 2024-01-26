package modules;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "json:target/json/results.json"},
        features = {"src/test/resources/features"},
        glue = {"modules", "step_definition"},
        tags = ""
)
/*
features : indique
glue : indique le chemin vers des fichiers contenant du code ou des annotations cucumber
 */

/**
 * Permet de controler et manipuler l'execution du test
 */
public class TestRunner {
}
