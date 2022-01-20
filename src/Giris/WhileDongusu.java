package Giris;

import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        int i = 1,left = 100, right = 200;
        System.out.println("Program Başladı");
        while (i <= 2){
            System.out.println(i +",");

            int k = 1;
            while (k <= 10){
                System.out.println(k + "k: ");
                k++;
            }
            i++;
        }
        System.out.println("\nProgram Bitti");

    // tam ortadaki sayıyı buluruz
        while ( ++left < --right);
        System.out.println(left);

        int password;
        boolean isPasswordSuccess = false;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Şifre giriniz");
        password = girdi.nextInt();

        while (!isPasswordSuccess){
            if (password == 123){
                System.out.println("Giriş Başarılı");
                isPasswordSuccess = true;
            } else {
                System.out.print("Tekrar Giriniz: ");
                password = girdi.nextInt();
            }
        }

    }

}
