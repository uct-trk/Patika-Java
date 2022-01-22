package Giris;

import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz");
        n = girdi.nextInt();

        for (int i = 1; i <= n; i = i * 2){
            System.out.println(i);
        }
    }
}
