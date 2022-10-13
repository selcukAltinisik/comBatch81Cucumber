When kullanici https://editor.datatables.net/ adresine gider
Then new butonuna basar
And "<First name>" girer
And "<Last name>" girer
And "<Position>" girer
And "<Office>" girer
And "<Extension>" girer
And "<Start date>" girer
And "<Salary>" girer
And Create tusuna basar
When kullanici ilk isim ile arama yapar
Then isim bolumunde isminin oldugunu dogrular