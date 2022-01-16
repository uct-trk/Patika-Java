package Giris;

import java.util.Scanner;

public class HesapMakinesiIfElse {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double num1, num2;
        int select;

        System.out.print("İlk sayıyı giriniz: ");
        num1 = girdi.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = girdi.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = girdi.nextInt();

        if (select == 1){
            System.out.print("Toplam: " + (num1 + num2));
        } else if (select == 2){
            System.out.print("Çıkarma: " + (num1 - num2));
        } else if (select == 3){
            System.out.print("Çarpma: " + (num1 * num2));
        } else if (select == 4) {
            if (num2 == 0){
                System.out.print("Bölen sıfır olamaz");
            } else {
                System.out.print("Bölme: " + (num1 / num2));
            }
        } else {
            System.out.print("Yanlış Seçim");
        }
    }


}
