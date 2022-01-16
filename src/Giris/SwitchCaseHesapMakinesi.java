package Giris;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double num1, num2;
        int select;

        System.out.print("İlk değeri giriniz: ");
        num1 = girdi.nextDouble();

        System.out.print("İkinci değeri giriniz: ");
        num2 = girdi.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = girdi.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplama: " + (num1 + num2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (num1 - num2));
                break;
            case 3:
                System.out.print("Çıkarma: " + (num1 * num2));
                break;
            case 4:
               if (num2 == 0){
                   System.out.print("Bölen sayı sıfır olamaz");
               } else {
                   System.out.print("Bölme: " + (num1 / num2));
               }
               break;
            default:
                System.out.print("1-4 arasındaki rakamlara basmalısınız!");
        }
    }
}
