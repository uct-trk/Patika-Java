package Giris;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");

        double n = input.nextInt();
        double result = 0;
        for (double i = 1; i <= n; i++){
            result = result + (1 / i);
        }
        System.out.println("Sonuc: " + result);
    }
}
