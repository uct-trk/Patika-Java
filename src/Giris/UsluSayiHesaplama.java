package Giris;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n, k, total = 1, i = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = inp.nextInt();

        System.out.print("Üst olacak sayı: ");
        k = inp.nextInt();

        // 3^4 = 3 x 3 x 3 x 3
        while (i <= k){
            total = total * n;
            i++;
        }
        System.out.println("Sonuç: " + total);
    }
}
