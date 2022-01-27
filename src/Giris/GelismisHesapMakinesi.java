package Giris;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int toplama(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int cikarma(int a, int b){
        int result = a - b;
        System.out.print("Çıkarma: " + result);
        return result;
    }
    static int carpma(int a, int b){
        int result = a * b;
        System.out.print("Çarpma: " + result);
        return result;
    }
    static int bolme(int a, int b){
        int result = a / b;
        System.out.println("Bölme: " + result);
        return result;
    }
    static int ustu(int a, int b){
        int result = 1;
       for (int i = 1; i<=b; i++){
           result = result * a;
       }
        System.out.println("Üstü: " + result);
        return result;
    }
    static int faktoriyel(int a){
        int result = 1;
        for (int i = 1; i<=a; i++){
            result = result * i;
        }
        System.out.println("Faktoriyel: " + result);
        return result;
    }
    static int modAlma(int a, int b){
        int result = a % b;
        System.out.println("Modu: " + result);
        return result;
    }
    static void cevreAlan(int a, int b){
        int cevre = (2 * a )  + (2 * b);
        int alan = a * b;
        System.out.println("Çevre: " + cevre + " Alan: " + alan);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı";

        while (true){
            System.out.println(menu + "\nseçiniz:  ");
            select = input.nextInt();
            if (select == 6){
                System.out.print("Bir sayı giriniz: ");
                int fac = input.nextInt();
                faktoriyel(fac);
                continue;
            }
            System.out.print("İlk sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = input.nextInt();
            switch (select){
                case 0:
                    System.out.println("Çıkış Yapıldı");
                    break;
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    ustu(a,b);
                    break;
                case 7:
                    modAlma(a,b);
                    break;
                case 8:
                    cevreAlan(a,b);
                    break;
                default:
                    System.out.println("Hatalı Değer Girdiniz");
                    break;
            }
        }
    }
}
