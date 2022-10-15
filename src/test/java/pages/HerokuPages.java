package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class HerokuPages {
    public HerokuPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "button[onclick=\"addElement()\"]")
    public WebElement addElementButton;
    @FindBy(css = "button[class=\"added-manually\"]")
    public WebElement deleteButton;
    @FindBy(xpath = "//h3[.='Add/Remove Elements']")
    public WebElement addRemovesElementsText;
    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteElement;

    @FindBy(id = "button")
    public WebElement clickButton;

    @FindBy(xpath = "//*[.=' down 32']")
    public List<WebElement> downText;

    @FindBy(xpath = "//*[.='click']")
    public List<WebElement> clickText;
}