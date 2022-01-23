package Giris;

import java.util.Scanner;

public class MinMaxSayilariniBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet, sayiBaslik = 1;

        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        adet = input.nextInt();

        if (adet > 1) {
            int girilecekSayi = adet;
            int enBuyuk = girilecekSayi;
            int enKucuk = girilecekSayi;
            for (int i = 1; i <= adet; i++) {
                System.out.print(sayiBaslik++ + ". Sayıyı Giriniz: ");
                 girilecekSayi = input.nextInt();

                if (enBuyuk < girilecekSayi) {
                    enBuyuk = girilecekSayi;
                }
                if (enKucuk > girilecekSayi) {
                    enKucuk = girilecekSayi;
                }
            }
            System.out.println("En Buyuk: " + enBuyuk);
            System.out.println("En Kucuk: " + enKucuk);
        } else {
            System.out.println("En az iki sayı olmalı");
        }
    }
}
