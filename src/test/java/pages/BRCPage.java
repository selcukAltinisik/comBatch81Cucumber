package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BRCPage {

    public BRCPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginYazisi;

    @FindBy (css = "input[id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy (css = "input[id='formBasicPassword']")
    public WebElement passwordTextBox;

    @FindBy (xpath = " //button[@class='btn btn-primary']")
    public WebElement ikinciLoginYazisi;

    @FindBy (xpath = "//*[text()='John Walker']")
    public WebElement jhonWalkerYazisi;

}