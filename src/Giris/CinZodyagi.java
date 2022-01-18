package Giris;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int birthDate ,mod = 12, sonuc;

        System.out.print("Doğum Tarihinizi Giriniz (Yıl Olarak): ");
        birthDate = girdi.nextInt();

        sonuc = birthDate % mod;

        switch (sonuc){
            case 0:
                System.out.println("Maymun");
            break;
            case 1:
                System.out.println("Horoz");
            break;
            case 2:
                System.out.println("Kopek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("Hesaplanamadı");
        }

    }
}
