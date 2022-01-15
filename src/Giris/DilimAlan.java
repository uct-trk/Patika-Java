package Giris;

import java.util.Scanner;

public class DilimAlan {
    public static void main(String[] args) {
        int r, alfa;
        double alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("yarı çapı giriniz: ");
        r = girdi.nextInt();
        System.out.print("alfa açısını giriniz: ");
        alfa = girdi.nextInt();
        alan = Math.PI * (Math.pow(r,2) * alfa) / 360;
        System.out.println("Alan: " + alan);


    }
}
