package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class Yandexpage {

    @FindBy  (css = "input#text")
    public WebElement serachbox;

    public Yandexpage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
