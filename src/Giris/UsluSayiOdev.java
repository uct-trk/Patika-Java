package Giris;

import java.util.Scanner;

public class UsluSayiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, total = 1;
        System.out.print("Üssü alınacak sayı");
        n = input.nextInt();

        System.out.print("Üst olacak sayı: ");
        r = input.nextInt();

        for (int i = 1; i <= r; i++){
            total = total * n;
        }
        System.out.print("Cevap: " + total);
    }
}
