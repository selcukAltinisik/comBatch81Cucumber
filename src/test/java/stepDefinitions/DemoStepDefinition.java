package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class DemoStepDefinition {
    DemoPage demo = new DemoPage();
    Actions actions = new Actions(Driver.getDriver());
    @When("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demo.alertWE.click();
    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        demo.click.click();
    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();
        String expectedAlertYazisi = "This alert appeared after 5 seconds";
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
}