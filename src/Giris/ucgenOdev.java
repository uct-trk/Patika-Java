package Giris;

import java.util.Scanner;

public class ucgenOdev {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a,b,c;
        double alan, cevre, u;
        System.out.print("1. Kenar: ");
        a = girdi.nextInt();

        System.out.print("2. Kenar: ");
        b = girdi.nextInt();

        System.out.print("3. Kenar: ");
        c = girdi.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = u * (u - a) * ( u - b) * (u - c);
        System.out.println("u: " + u);
        System.out.println("Cevre: " + cevre);
        System.out.println("Alan: " + alan);

    }
}
