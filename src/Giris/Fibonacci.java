package Giris;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n1 = 0, n2 = 1, n3;
        int count = input.nextInt();

        System.out.print(n1 + " " + " " + n2);

        for (int i = 1; i < count; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
