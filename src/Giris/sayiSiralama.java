package Giris;

import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Birinci sayı: ");
        a = input.nextInt();

        System.out.print("İkinci sayı: ");
        b = input.nextInt();

        System.out.print("Üçüncü sayı: ");
        c = input.nextInt();

        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((a < b) && (a > c)){
            System.out.println("b > a > c");
        } else if ((a < b) && (a < c)){
            if (b > c){
                System.out.println("b > c > a");
            } else {
                System.out.println("c > b > a");
            }
        } else {
            System.out.println("c > a > b");
        }
    }
}
