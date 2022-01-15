package Giris;

import java.util.Scanner;

public class KdvHesaplamaOdev {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double fiyat, kdvOran1 = 0.18, kdvOran2 = 0.08, kdv;

    System.out.print("Fiyatı giriniz: ");
    fiyat = input.nextDouble();

    kdv = (fiyat >= 0 && fiyat <= 1000) ? (fiyat * kdvOran1) : (fiyat * kdvOran2);
    System.out.println("Ürünün KDV tutarı: " + kdv);
  }
}
