package stepDefinitions;

import io.cucumber.java.en.*;
import utilities.Driver;

public class PracticeFormStepDefs {

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        Driver.getDriver().get(url);
    }
    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void username_password_ve_textarea_kisimlarini_doldurur(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("bir dosya yukler")
    public void bir_dosya_yukler() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("checkbox1 i secer")
    public void checkbox1_i_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("radio2 yi secer")
    public void radio2_yi_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selection item3 secer")
    public void selection_item3_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("dropdown itmem4 secer")
    public void dropdown_itmem4_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("submite tiklar")
    public void submite_tiklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
