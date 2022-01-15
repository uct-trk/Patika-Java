package Giris;

import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenarını giriniz: ");
        a = input.nextDouble();

        System.out.print("B kenarını giriniz: ");
        b = input.nextDouble();
        double d = Math.pow(a,2) + Math.pow(b,2);
        c = Math.sqrt(d);

        System.out.println("Uzun kenar: " + c);


    }
}
