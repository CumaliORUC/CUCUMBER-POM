package stepdefinitions;

import io.cucumber.java.en.Given;
import utulities.ConfigReader;
import utulities.Driver;

public class VisitWebPageStep_Definitions {

    @Given("Go to {string} page")
    public void go_to(String sayfa_url) {
        Driver.getDriver().get(ConfigReader.getProperty(sayfa_url));
    }

}
