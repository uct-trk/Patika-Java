package Giris;

import java.util.Scanner;

public class DeseneGoreMetotRecursive {

    static void desen(int sayi, int geciciSayi, boolean x){
        if (geciciSayi <= 0){
            x = false;
        }
        int yeniSayi = x ? (geciciSayi - 5) : (geciciSayi + 5);
        if(yeniSayi <= sayi){
            desen(sayi, yeniSayi, x);
        }
        sayi = geciciSayi;
        System.out.println("sayı => " + sayi + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi;
        sayi = input.nextInt();
        desen(sayi, sayi, true);
    }
}
