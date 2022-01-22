package Giris;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n, toplam = 0;

       do {
           System.out.print("Sayı Giriniz: ");
           n = girdi.nextInt();
           if(n % 2 == 1){
               toplam = toplam + n;
           }
           System.out.println("Toplam = " + toplam);
       } while (n > 0);

        System.out.print("Toplam = " + toplam);


    }
}
