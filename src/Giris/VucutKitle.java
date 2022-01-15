package Giris;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double kilo, boy, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz cm olarak: ");
        boy = input.nextDouble();

        sonuc = kilo / ((boy * boy) / (100 * 100));
        System.out.println("Vücut Kitle İndeksiniz:" + sonuc);
    }
}
