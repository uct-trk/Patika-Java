package Giris;

import java.util.Scanner;

public class GirilenSayıyaKadarCiftSayilar {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayilar;

        System.out.print("Sayi giriniz: ");
        sayilar = girdi.nextInt();

        for (int i = 0; i <= sayilar; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
