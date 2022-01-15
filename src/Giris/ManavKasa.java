package Giris;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutAnlikFiyat, elmaAnlikFiyat, domatesAnlikFiyat, muzAnlikFiyat, patlicanAnlikFiyat;
        double total, totalKg;

        System.out.print("Kaç kg armut aldınız: ");
        armutKg = girdi.nextDouble();
        armutAnlikFiyat = armut * armutKg;
        System.out.println("Armut Fiyatı: " + armutAnlikFiyat + " Armut Kg: " + armutKg);

        System.out.print("Kaç kg elma aldınız: ");
        elmaKg = girdi.nextDouble();
        elmaAnlikFiyat = elma * elmaKg;
        System.out.println("Elma Fiyatı: " + elmaAnlikFiyat + " Elma Kg: " + elmaKg);

        System.out.print("Kaç kg domates aldınız: ");
        domatesKg = girdi.nextDouble();
        domatesAnlikFiyat = domates * domatesKg;
        System.out.println("Domates Fiyatı: " + domatesAnlikFiyat + " Domates Kg: " + domatesKg);

        System.out.print("Kaç kg muz aldınız: ");
        muzKg = girdi.nextDouble();
        muzAnlikFiyat = muz * muzKg;
        System.out.println("Muz Fiyatı: " + muzAnlikFiyat + " Muz Kg: " + muzKg);

        System.out.print("Kaç kg patlıcan aldınız: ");
        patlicanKg = girdi.nextDouble();
        patlicanAnlikFiyat = patlıcan * patlicanKg;
        System.out.println("Patlıcan Fiyatı: " + patlicanAnlikFiyat + " Patlıcan: " + patlicanKg);

        total = armutAnlikFiyat + elmaAnlikFiyat + domatesAnlikFiyat + muzAnlikFiyat + patlicanAnlikFiyat;
        totalKg = armutKg + elmaKg + domatesKg + muzKg + patlicanKg;
        System.out.println("Toplam Tutar: " + total + "\n" + "Toplam Kilogram: " + totalKg);
    }
}
