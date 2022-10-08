package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@gp1 or @gp2",
        dryRun = false
)


public class Runner {

    /*
        Runner class'ı TestNG'deki XML mantığı ile çalışır. Çalıştırmak istediğimiz senaryolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XML'deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
        Bu class'ta kullanacağımız 2 adet notasyon vardır.....
        -   @RunWith(Cucumber.class)    notasyonu Runner class'ına çalışma özelliği ekler.
        Bu notasyon olduğu için Cucumber framework'umuzde Junit kullanmayı tercih ederiz.

        -   @CucumberOptions notasyonu içinde
        features : Runner dosyasının feature dosyasını nereden bulacağını tarif eder.
        glue : stepDefinitions yolunu belirtiriz
        tags : Hangi tag'içalıştırmak istiyorsakonu belli eder.

        dryRun: İki seçenek vardır.
        dryRun = true; derse, testimizi çalıştırmadn eksikadımları bize verir
        dryRun = false; testlerimizi driver ile çalıştırır..

     */

}
