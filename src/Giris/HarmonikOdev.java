package Giris;

import java.util.Scanner;

public class HarmonikOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        double n = input.nextDouble();
        int i = 1;
        double result = 0;
        while (i <= n){
            result = result + (i / n);
            i++;
        }
        System.out.println("Sonuc: " + result);
    }
}
