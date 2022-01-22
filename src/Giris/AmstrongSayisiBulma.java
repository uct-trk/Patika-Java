package Giris;

import java.util.Scanner;

public class AmstrongSayisiBulma {
    public static void main(String[] args) {
        /*
        Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int basamakDegeri;
        int  basamakSayisi = 0 ;
        int sayi = input.nextInt();
        int  geciciSayi = sayi;
        int toplam = 0;
        int basamakUst;

        // Basamak sayısı bulma
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (geciciSayi != 0){
            geciciSayi = geciciSayi / 10;
            basamakSayisi++;
        }
        System.out.println("Basamak sayısı: " + basamakSayisi);

        // Bir sayının son basamağını bulma (mod)
        // 2451 % 10 = 1

        geciciSayi = sayi;
        while (geciciSayi != 0){
            basamakDegeri = geciciSayi % 10;
            System.out.println("Basamak değeri: " + basamakDegeri);
            basamakUst = 1;
            for (int i = 1; i <= basamakSayisi; i++){
                basamakUst = basamakUst * basamakDegeri;
            }
            toplam = toplam + basamakUst;
            geciciSayi = geciciSayi / 10;
        }
        System.out.println("Toplam: " + toplam);

        if (toplam == sayi){
            System.out.println(sayi + " Amstrong sayıdır");
        } else {
            System.out.println(sayi + " Amstrong sayı değildir");
        }

    }
}
