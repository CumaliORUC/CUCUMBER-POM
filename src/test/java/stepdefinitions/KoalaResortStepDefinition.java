package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.KoalaResortPage;
import utulities.ConfigReader;
import utulities.Driver;

public class KoalaResortStepDefinition {
        KoalaResortPage koalaResortPage=new KoalaResortPage();
    @Then("Click to gelismis")
        public void click_to_gelismis() {
            koalaResortPage.gelismis.click();

        }
    @Then("Click to adresslink")
        public void click_to_adresslink() {
            koalaResortPage.addressLink.click();
        }
    @Then("Click to Login")
    public void click_to_login() {
            koalaResortPage.Login.click();
        }
    @Then("Enter the valid usurname")
        public void enter_the_valid_usurname() {
            koalaResortPage.usurname.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        }
    @Then("Enter the valid password")
        public void enter_the_valid_password() {
            koalaResortPage.password.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        }
    @Then("Click to LoginButton")
        public void click_to_login_button() {
            koalaResortPage.LoginButton.click();
        }
    @Then("Test the login aproved")
        public void test_the_login_aproved() {
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty("kr_login_url")));
        }

    @And("Enter the {string} usurname")
        public void enterTheUsurname(String usurname) {
            koalaResortPage.usurname.sendKeys(ConfigReader.getProperty(usurname));
        }

    @Then("Enter the {string} password")
        public void enterThePassword(String pasword) {
            koalaResortPage.password.sendKeys(ConfigReader.getProperty(pasword));
        }

    @And("Test the login unsuccess")
        public void testTheLoginUnsuccess() {
            Assert.assertTrue(koalaResortPage.wrongLogin.isDisplayed());
        }
}
