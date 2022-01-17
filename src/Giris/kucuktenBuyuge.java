package Giris;

import java.util.Scanner;

public class kucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z;

        System.out.print("x sayıyı giriniz: ");
        x = input.nextInt();

        System.out.print("y sayıyı giriniz: ");
        y = input.nextInt();

        System.out.print("z sayıyı giriniz: ");
        z = input.nextInt();

        if ((x < y) && (x < z)){
            if (y < z){
                System.out.println("x < y < z");
            } else {
                System.out.println("x < z < y");
            }
        } else if ((x > y) && (x > z)){
            if (y > z){
                System.out.println("z < y < x");
            } else {
                System.out.println("y < z < x");
            }
        } else if ((x > y) && (x < z)){
            System.out.println("y < x < z");
        } else {
            System.out.println("x < z < y");
        }
    }
}
