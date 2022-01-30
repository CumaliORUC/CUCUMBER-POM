package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DataTable_Page;
import utulities.ConfigReader;
import utulities.Driver;

public class DataTableStepDefinitions {

    DataTable_Page dataTable_page=new DataTable_Page();
    @Then("Click to new icon")
        public void click_to_new_icon() {
        dataTable_page.NewButton.click();
    }
    @Then("Fill up all infos")
        public void fill_up_all_infos() throws InterruptedException {
        Faker faker=new Faker();
        Actions action=new Actions(Driver.getDriver());


        action.sendKeys(ConfigReader.getProperty("dataTable_firstName") +Keys.TAB)
                .sendKeys(ConfigReader.getProperty("dataTable_lustName")+Keys.TAB)
                .sendKeys(faker.job().position()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB)
                .sendKeys(faker.job().field()).sendKeys(Keys.TAB).perform();

        dataTable_page.startDate.click();
        Thread.sleep(3000);
        Select selectmounth=new Select(dataTable_page.mounth);
        selectmounth.selectByVisibleText("July");

        Select selectyear=new Select(dataTable_page.year);
        selectyear.selectByVisibleText("2000");

        dataTable_page.day14.click();

        dataTable_page.salary.sendKeys("12000");

    }
    @Then("Click to Create")
        public void click_to_create() {
        dataTable_page.createButton.click();
        dataTable_page.closeButton.click();

    }
    @When("Search entered first name")
        public void search_entered_first_name() {
        dataTable_page.searchbox.sendKeys(ConfigReader.getProperty("dataTable_firstName")+
                " "+ConfigReader.getProperty("dataTable_lustName"));
    }
    @Then("Test the first name created")
        public void test_the_first_name_created() {
        Assert.assertEquals(ConfigReader.getProperty("dataTable_firstName")+
                " "+ConfigReader.getProperty("dataTable_lustName"),dataTable_page.firstNamebox.getText());
    }
}
