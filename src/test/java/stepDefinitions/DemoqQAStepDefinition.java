package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQAPage;
import utilities.Driver;

import java.time.Duration;

public class DemoqQAStepDefinition {

    DemoQAPage demoQAPage = new DemoQAPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    @Then("Visible After five seconds butonunun gorunur olmasini bekleyin")
    public void visibleAfterFiveSecondsButonununGorunurOlmasiniBekleyin() {
        wait.until(ExpectedConditions.visibilityOf(demoQAPage.visibleAfter));
    }

    @And("Visible After five seconds butonunun gorunur oldugunu test edin")
    public void visibleAfterFiveSecondsButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(demoQAPage.visibleAfter.isDisplayed());
    }
}
