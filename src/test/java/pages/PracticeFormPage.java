package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeFormPage {

    public PracticeFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@name='username']" )
    public WebElement userName;

    @FindBy (xpath = "//input[@name='password']" )
    public WebElement password;

    @FindBy (xpath = "//*[.='Comments...']" )
    public WebElement textArea;

}
