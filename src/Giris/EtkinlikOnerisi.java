package Giris;

import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        // Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        // Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        // Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        // Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        int heat;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz: ");
        heat = girdi.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz!");
        } else if (heat >= 5 && heat <= 25){
            if (heat <= 15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if (heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin");
        }

    }
}
