package Giris;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi; i++){
            if (sayi %i == 0){
                toplam = toplam + i;
            }
        }
        if (toplam == 2 * sayi){
            System.out.println(sayi + " Mükemmel sayıdır");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir");
        }

    }
}
