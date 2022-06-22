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

`public class Human extends Monkey implements Interface1, Interface2{
    //...
}`
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