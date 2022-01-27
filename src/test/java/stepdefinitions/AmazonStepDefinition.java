package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utulities.ConfigReader;
import utulities.Driver;

public class AmazonStepDefinition {
    Amazonpage amazonpage=new Amazonpage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }

    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
        amazonpage.searchbox.sendKeys("Iphone"+ Keys.ENTER);
    }

    @Then("sonuclarin Iphone icerdigini test eder")
    public void sonuclarin_ıphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonpage.result.getText().contains("Iphone"));
    }

    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        amazonpage.searchbox.clear();
        amazonpage.searchbox.sendKeys("tea pot"+ Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(amazonpage.result.getText().contains("tea pot"));
    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonpage.searchbox.clear();
        amazonpage.searchbox.sendKeys("flower"+ Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        Assert.assertTrue(amazonpage.result.getText().contains("flower"));
    }

    @And("sayfayi kapatır")
    public void sayfayiKapatır() {
        Driver.closeDriver();
    }
}
