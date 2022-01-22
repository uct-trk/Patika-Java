package Giris;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int  n, total = 1;
        // n! =  1 * 2 * 3 * ...... * n
        System.out.print("Sayi Giriniz: ");
        n = girdi.nextInt();
        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        System.out.print("Sonuç: " + total);
    }
}
