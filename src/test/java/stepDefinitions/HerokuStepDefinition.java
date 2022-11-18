package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPages;
import utilities.Driver;
import utilities.ReusableMethods;
import java.time.Duration;
public class HerokuStepDefinition {
    HerokuPages herokuPages = new HerokuPages();

    @Given("User goes to direct {string}")
    public void userGoesToDirect(String directUrl) {
        Driver.getDriver().get(directUrl);
    }

    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        herokuPages.addElementButton.click();
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuPages.deleteButton));
        //Reusable ile
        // ReusableMethods.waitForVisibility(herokuPages.deleteButton,10);
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        assert herokuPages.deleteButton.isDisplayed();
        //Bu sekilde de kullanilabiliyor
        //herokuPages.deleteButton.isDisplayed() sonuna nokta koyarsak
        // yukardaki sekilde de assert kullanimini assert true olarak kullanabiliriz.
        //Eger assert equals kullanacaksak   assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
        // bu method sekli sadece true / onune unlem koyarsak false seklinde kullanilir
        // Assert.assertTrue(herokuPages.deleteButton.isDisplayed());
    }
    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {

        herokuPages.deleteButton.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {

        assert !herokuPages.deleteElement.isDisplayed();
    }

    @And("AddRemove Elements yazisinin gorunurlugunu test eder")
    public void addremoveElementsYazisininGorunurlugunuTestEder() {
        assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
    }


    @And("User waits {int} second")
    public void userWaitsSecond(int wait) {
        try {
            Thread.sleep(wait*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("User close browser")
    public void userCloseBrowser() {
        Driver.getDriver().close();
    }
}