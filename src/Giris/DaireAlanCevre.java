package Giris;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int r;
        double alan, cevre;
        System.out.println("Yarı çapı giriniz");
        r = girdi.nextInt();
        alan = Math.PI * Math.pow(r,2);
        cevre = 2 * Math.PI * r;
        System.out.println("Alan: " + alan + " Çevre: " + cevre);
    }
}
