package Giris;

import java.util.Scanner;

public class GirilenSayiyaKadar4ve5KuvvetleriniBulma {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i = i * 4){
            System.out.println("4 ün Kuvvetleri: " + i);
        }
        for (int i = 1; i <= n; i = i * 5){
            System.out.println("5 in Kuvvetleri: " + i);
        }
    }
}
