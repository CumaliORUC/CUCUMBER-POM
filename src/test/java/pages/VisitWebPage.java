package pages;

import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class VisitWebPage {
    public VisitWebPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
