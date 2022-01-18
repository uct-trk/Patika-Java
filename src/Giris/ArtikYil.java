package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year, sonuc;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        year = girdi.nextInt();

        if (year >= 400 ){
            if (year % 400 == 0){
                System.out.println("Artık Yıldır");
            } else if (year % 4 == 0) {
                System.out.println("Artık Yıldır");
            } else {
                System.out.println("Artık Yıl Değildir");
            }
        } else if (year % 4 == 0){
            System.out.println("Artık Yıldır");
        } else {
            System.out.println("Artık Yıl Değildir");
        }
    }
}
