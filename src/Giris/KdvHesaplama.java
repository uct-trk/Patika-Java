package Giris;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat, kdv;

        System.out.println("Fiyatı giriniz: ");
        fiyat = input.nextDouble();
        kdv = fiyat * 0.18;

        System.out.println("Ürünün KDV tutarı: " + kdv);
    }
}
