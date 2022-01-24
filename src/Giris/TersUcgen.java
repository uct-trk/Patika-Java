package Giris;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int basamak = input.nextInt();

        for (int i = 1; i <= basamak; i++){
            int a = -1;
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
                a = a + 2;
            }
            for (int j = 1; j <= ((basamak * 2) - a) ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
