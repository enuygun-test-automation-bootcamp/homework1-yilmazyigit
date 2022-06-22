import java.util.Scanner;

public class Yonetici {
    FiyatHesaplama fiyatHesaplama;
    Scanner scanner = new Scanner(System.in);
    void alisveris(){
        System.out.println("-------------------\n-> Ekmek Hesaplamasi\n-------------------");
        System.out.print("-> Ekmek sayisi: ");
        int x = scanner.nextInt();
        System.out.println("-> Ekmek Fiyati: "+fiyatHesaplama.ekmekAl(x)/x+" TL");
        System.out.println("-> Almis oldugunuz "+ x +" Ekmek icin odeyeceginiz fiyat: "+fiyatHesaplama.ekmekAl(x)+" TL");
        System.out.println("-------------------");
    }
}
