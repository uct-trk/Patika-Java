package Giris;

import java.util.Scanner;

public class RecursiveUsluSayı {

    static int ust(int base, int exponent){
        if (exponent == 0){
            return 1;
        } else {
            System.out.println("Üst => " + exponent);
            int result = base * ust(base, exponent - 1);
            System.out.println("Yeni sayı => " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,exponent;
        System.out.print("Taban: ");
        base = input.nextInt();
        System.out.print("Üst: ");
        exponent = input.nextInt();

        System.out.println(ust(base,exponent));
    }
}
