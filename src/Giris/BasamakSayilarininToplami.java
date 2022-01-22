package Giris;

import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = girdi.nextInt();
        int basamakSayisi = 0;
        int basamakDegeri;
        int deger = 0;
        int sonuc = 0;
        int geciciSayi = sayi;


        while (geciciSayi != 0){
            geciciSayi = geciciSayi / 10;
            basamakSayisi++;
        }
        System.out.println("Basamak Sayısı: " + basamakSayisi);

        geciciSayi = sayi;
        while (geciciSayi != 0){
            basamakDegeri = geciciSayi % 10;
            System.out.println("Basamak Değeri: " + basamakDegeri);
            int basmakUst = 1;
            for (int i = 1; i <= basamakSayisi; i++){
                deger =  basamakDegeri * basmakUst;
            }
            sonuc = sonuc + deger;
            geciciSayi = geciciSayi / 10;
            System.out.println("deger: " + deger);
        }
        System.out.println("sayı: " + sayi);
        System.out.println("sonuc: " + sonuc);
    }
}
