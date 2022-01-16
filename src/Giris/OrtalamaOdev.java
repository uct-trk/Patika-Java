package Giris;

import java.util.Scanner;

public class OrtalamaOdev {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, dersSayisi = 0;
        double ortalama, toplam = 0;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik: ");
        matematik = girdi.nextInt();
        System.out.print("Fizik: ");
        fizik = girdi.nextInt();
        System.out.print("Turkce: ");
        turkce = girdi.nextInt();
        System.out.print("Kimya: ");
        kimya = girdi.nextInt();
        System.out.print("Müzik: ");
        muzik = girdi.nextInt();



        if (matematik <= 100 && matematik >= 0){
            dersSayisi++;
            toplam = toplam + matematik;
        }  if (fizik <= 100 && fizik >= 0) {
            dersSayisi++;
            toplam = toplam + fizik;
        } if (turkce <= 100 && turkce >= 0) {
            dersSayisi++;
            toplam = toplam + turkce;
        } if (kimya <= 100 && kimya >= 0) {
            dersSayisi++;
            toplam = toplam + kimya;
        }  if (muzik <= 100 && muzik >= 0) {
           dersSayisi++;
           toplam = toplam + muzik;
        }

        ortalama = toplam / dersSayisi;

        if (ortalama < 55){
            System.out.println("Kaldınız");
        } else {
            System.out.println("Geçtiniz");
        }
        System.out.println("ortalama: " + ortalama);
        System.out.println("ders sayısı: " + dersSayisi);
        System.out.println("toplam: " + toplam);
    }
}
