package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class DataTable_Page {
    public DataTable_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='New']")
    public WebElement NewButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDate;

    @FindBy(css="select.dt-datetime-month")
    public WebElement mounth;

    @FindBy(css="select.dt-datetime-year")
    public WebElement year;

    @FindBy(xpath = "//td[@data-day='14']")
    public WebElement day14;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchbox;

    @FindBy (xpath = "//tr[1]//td[2]")
    public WebElement firstNamebox;

    @FindBy(css = "div.DTED_Lightbox_Close")
    public WebElement closeButton;


}
