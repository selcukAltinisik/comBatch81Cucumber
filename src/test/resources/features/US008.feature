Scenario: TC11 kullanici gecersiz bilgilerle giris yapar
Given kullanici Blue RentaCar ana sayfasinda
Then Log in yazisina tiklar
And gecersiz username girer
And gecersiz password girer
And Login butonuna basar
Then sayfaya giris yapilamadigini kontrol eder
And kulllanici sayfayi kapatir