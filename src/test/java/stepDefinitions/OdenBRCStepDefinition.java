package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BRCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class OdenBRCStepDefinition {

    BRCPage brcPage=new BRCPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenurl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenurl));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.loginYazisi.click();
    }

    @And("{string} username girer")
    public void usernameGirer(String gecersizEmail) {
        brcPage.emailTextBox.sendKeys(gecersizEmail);
    }

    @And("{string} password girer")
    public void passwordGirer(String gecersizPass) {
        brcPage.passwordTextBox.sendKeys(gecersizPass);
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        brcPage.ikinciLoginYazisi.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.ikinciLoginYazisi.isDisplayed());
    }
}