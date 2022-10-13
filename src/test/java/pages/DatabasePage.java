package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatabasePage {
    public DatabasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
