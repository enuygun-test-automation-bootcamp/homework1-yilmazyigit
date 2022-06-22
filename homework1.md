# Homework1
<p style="color: red">1.<p>

**Sınıfları kullanırken implement ve extend ile çağırabiliyoruz. İkisini aynı anda kullanınca hangisi önce yürütülür ?**
<p>
Java'da implement ve extend anahtar sözcükleri,
nesne yönelimli programlamada kalıtım amacıyla kullanılır.
Extend anahtar sözcüğü daha çok bir class'ta alt class oluşturmak için 
kullanılırken, implements anahtar sözcüğü genelde bir interface oluşturmak
amacıyla kullanılır. 
<p>

<p>
Aynı anda hem arayüz hemde kalıtım amacıyla alt sınıf oluşturmak istiyorsak, extend ve implements 
anahtar sözcüklerini kullanırken, extends anahtar sözcüğünü implements'ten önce kullanmamız lazım

``` 
public class Human extends Monkey implements Interface1, Interface2{ 
    //...
}
```
<p>

<p>
İstediğimiz sayıda interface'i kodumuza implement edebiliriz. Eğer birden fazla interface kullanacaksak, interface'ler virgül ile ayrılmalı.
<p>

<p style="color: red">2.<p>


### Access Modifiers in Java
<p>
Adından da anlaşılabileceği gibi Java'da access modifiers bir class'ın, bir değişkenin,
bir methodun yani herhangi bir datanın kapsamını kısıtlamamızı sağlar.
<p>

- Static <br>
Değişken ya da yöntem bir sınıfa bağlıdır.
- Public <br>
Herkes veriye erişebilir.
- Protected <br>
protected methods sadece o sınıf ve alt snınıflarınca erişilebilir.
- Internal <br>
Sadece derleme içerisinden erişilebilir.
- private (default) <br>
Erişim sadece o türle sınırlıdır.

<p style="color: red">3.<p>

### Abstraction nedir?
<p>
Java'da Abstraction yani soyutlama işlemi, gereksiz detayları gizleyerek sadece ihtiyaç duyulan 
işleri göstermeye yarar.

* Kodun yinelenmesini engeller. 
* Kod karmaşıklığını azaltır.
* Kullanıcı gereksiz ayrıntıları görmediği için programın güvenliğini sağlamış olur.
<p>

````aidl
abstract class ornek {
 
  // soyut sınıf metodu oluşturduk
  public void cıktı() {
    System.out.println("Kod kampüsüne hoş geldiniz.");
  }
}
//ornek sınıfını miras alan bir main sınıfı oluşturduk 
class Main extends ornek {
 
  public static void main(String[] args) {
    
    // main nesnnesi oluşturduk
    Main main = new Main();
    main.cıktı();
  }
}
````

<p>Adım adım inceleyelim: <p>
Öncelikle fiyatHesaplama isimli class'ımızı oluşturalım:

```aidl
public abstract class FiyatHesaplama {
    abstract double ekmekAl(int ekmekFiyati); // Ekmek hesaplamasını yaptırtacağımız soyut metot tanımlaması.
}
```

Oluşturduğumuz üst sınıf üzerinden **market** ve **mahalleBakkali** olarak 2 adet alt sınıf tanımlayalım.
market için ekmekFiyati, 4 TL ve mahalle bakkalı için ekmekFiyati 2 TL olsun.

```aidl
public class Market extends FiyatHesaplama{
    @Override
    double ekmekAl(int ekmekFiyati){
        return ekmekFiyati*4.0;
    }
}

```
```aidl
public class MahalleBakkali extends FiyatHesaplama{
    @Override
    double ekmekAl(int ekmekFiyati){
        return ekmekFiyati*2.0;
    }
}
```
Daha sonra **Yonetici** sınıfı oluşturarak içerisine kullanıcıdan kaç ekmek almak istediğini
klavyeden girerek sonucu ekrana yazdıran bir **alisveris()** methodu tanımlayalım.

```aidl
import java.util.Scanner;

public class Yonetici {
    FiyatHesaplama fiyatHesaplama;
    Scanner scanner = new Scanner(System.in);
    void alisveris(){
        System.out.println("-------------------\n-> Ekmek Hesaplaması\n-------------------");
        System.out.print("-> Ekmek sayisi: ");
        int x = scanner.nextInt();
        System.out.println("-> Ekmek Fiyatı: "+fiyatHesaplama.ekmekAl(x)/x+" TL");
        System.out.println("-> Almış Olduğunuz "+ x +" Ekmek icin Ödeyeceğiniz Fiyat: "+fiyatHesaplama.ekmekAl(x)+" TL");
        System.out.println("-------------------");
    }
}
```
İşlemleri **Main** içerisinde çalıştırabilmek için **alisveris** methodunu çağırarak
kodumuzu tamamlayalim.

```aidl
public class Main {
    public static void main(String[] args) {
        Yonetici yonetici = new Yonetici();
        yonetici.fiyatHesaplama = new Market();
        yonetici.alisveris();
    }
}
```

Program çıktısı:

```aidl
-------------------
-> Ekmek Hesaplamasi
-------------------
-> Ekmek sayisi: 10
-> Ekmek Fiyati: 4.0 TL
-> Almis oldugunuz 10 Ekmek icin odeyeceginiz fiyat: 40.0 TL
-------------------
```










