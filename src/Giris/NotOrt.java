package Giris;

import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fiz, kim, turkce, tarih, muzik, ort, toplam;


        System.out.println("Matematik notu: ");
        mat = input.nextDouble();

        System.out.println("Fizik notu: ");
        fiz = input.nextDouble();

        System.out.println("Kimya notu: ");
        kim = input.nextDouble();

        System.out.println("Turkce notu: ");
        turkce = input.nextDouble();

        System.out.println("Tarih notu: ");
        tarih = input.nextDouble();

        System.out.println("Muzik notu: ");
        muzik = input.nextDouble();

        toplam = mat + fiz + kim + turkce + tarih + muzik;
        ort =  toplam / 6;

        System.out.println(ort >= 60 ? ort + "gectiniz" : ort + "Kaldınız");
    }
}
