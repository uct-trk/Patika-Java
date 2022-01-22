package Giris;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, resultFirst = 1, resultSecond = 1, resultThird = 1, diff, total;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. sayı: ");
        n = girdi.nextInt();

        System.out.print("2. sayı: ");
        r = girdi.nextInt();

        diff = n - r;
        if ( n >= r && n >= 0 && r >= 0){
            for (int i = 1; i <= n; i++){
                resultFirst = resultFirst * i;
            }
            for (int i = 1; i <= r; i++){
                resultSecond = resultSecond * i;
            }
            for (int i = 1; i <= diff; i++){
                resultThird = resultThird * i;
            }
            total = resultFirst / (resultSecond * resultThird);
            System.out.print("Sonuç: " + total);
        } else {
            System.out.println("ilk sayı ikincisinden küçük olamaz");
        }
    }
}
