package Giris;

import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {
        // scanner sınıfını input adında değişkenine atıyoruz
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("A için lütfen değer giriniz");
        // oluşturduğumuz değişkeni kullanıyoruz, veri tipi neyse next yapısı ona göre kullanılır
        a = input.nextInt();
        System.out.println("A çıktısı" + a);

        System.out.println("B sayısını giriniz");
        b = input.nextInt();
        System.out.println("B çıktısı: " + b);

        System.out.println("C için yazı yazınız");
        String str = input.next();
        System.out.println(str);
    }
}
