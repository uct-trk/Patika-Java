package Giris;

import java.util.Scanner;

public class UceVeDordeBolunenSayilarinOrt {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi, toplam = 0, adet = 0;
        double ort;

        System.out.print("Sayı Giriniz: ");
        sayi = girdi.nextInt();
        for (int i = 0; i <= sayi; i++){
            if ( i % 3 == 0 && i % 4 == 0){
               toplam = toplam + i;
               adet++;
            }
        }
        ort = toplam / adet;
        System.out.println("Adet: " + adet);
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ort);
    }
}
