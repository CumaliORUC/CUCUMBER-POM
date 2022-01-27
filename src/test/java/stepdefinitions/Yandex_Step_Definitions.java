package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Yandexpage;
import utulities.ConfigReader;
import utulities.Driver;

public class Yandex_Step_Definitions {

    Yandexpage yandexpage=new Yandexpage();

    @Given("Go to yandex web page")
    public void go_to_yandex_web_page() {
        Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));
    }
    @And("Search {string}")
    public void search(String items) {
        yandexpage.serachbox.clear();
        yandexpage.serachbox.sendKeys(items, Keys.ENTER);
    }

    @And("test the {string} at results")
    public void testTheAtResults(String items) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(items));
    }
}
