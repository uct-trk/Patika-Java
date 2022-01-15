package Giris;

import java.util.Scanner;

public class taksiMetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        // km başı 2.2 tl
        // açılış ücreti 10 tl
        // minimum 20 tl ödeme olacaktır
        double acilis = 10, perMt = 0.0022, minimum = 20, mesafe, toplam, total;

        System.out.print("Gitmek istediğiniz mesafeyi giriniz: ");
        mesafe = girdi.nextDouble();
        System.out.println("Gitmek istediğiniz mesafe" + mesafe);

        toplam = acilis + (perMt * mesafe);
        total = toplam <= minimum ? minimum : toplam;
        System.out.println("Toplam: " + total);


    }
}
