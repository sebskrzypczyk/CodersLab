package Zdanie1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Zdanie1/Features/",
        glue = {"steps"},
        plugin = {"pretty","html:out"})


public class KupTest {
}
