package Giris;

import java.util.Scanner;

public class RecursiveAsalSayiBulma {

    static  int asalSayi(int a, int b){
        if (b == 1){
            return 1;
        } else {
            if (a %b == 0){
                return 0;
            } else {
                return asalSayi(a, b - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,asal;
        System.out.print("Sayı giriniz: ");
        a = input.nextInt();

        asal = asalSayi(a, a/2);
        if (asal==1){
            System.out.println(a+" sayisi asaldir");
        }else {
            System.out.println(a+" sayisi asal değildir");
        }

    }
}
