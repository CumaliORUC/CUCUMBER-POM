package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class Amazonpage {
    public Amazonpage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchbox;

    @FindBy (xpath = "//div[@class='s-desktop-width-max sg-row-align-items-center sg-row']")
    public WebElement result;
}
