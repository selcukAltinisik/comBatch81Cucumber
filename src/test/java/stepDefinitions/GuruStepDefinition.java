package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {

    GuruPage guru = new GuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index = 0;
        for (int i = 0; i <guru.basliklar.size() ; i++) {
          if (guru.basliklar.get(i).getText().equals(baslik)){  //  Feature'dan gelen string değeri i değerine eşitledik
              System.out.println(guru.basliklar.get(i).getText());  //  Feature'dan gelen başlığı yazdırdık.
              index = i+1;  //  Feature'dan gelen ve i değerine eşitlediğimiz string'i aynı değere sahip sütunları da
              //    yazdırabilmek için boş bir konteynır oluşturup ona atadık. List'te index 0(sıfır)'dan başladığı için
              //    ve webTable locate'imiz 1'den başladığı için i değerini bir arttırdık.
              List<WebElement> sutunElement = Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
              //Sonrasında webTable'daki body'i locate edip eşitlediğimiz index'i başlık altındaki sutunu getirebilmesi
              // için bu liste koyduk.

              sutunElement.forEach(t-> System.out.println(t.getText()));
              // Lambda ile de o sutunu yazdırdık.
              //    for (WebElement w:sutunElement) {
              //        System.out.println(w.getText());
              //    }

          }

        }

    }

}
