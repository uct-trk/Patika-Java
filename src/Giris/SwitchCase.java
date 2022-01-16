package Giris;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // java çıktısını verir çünkü case:6 dan sonra break kullanılmamış
        int points=6;
        switch(points)
        {
            case 6: ;
            case 7: System.out.println("Java");break;
            case 8: ;
            case 9: System.out.println("101");break;
            case 10: System.out.println("Patika"); break;
            default: System.out.println("Dev");
        }

        // günleri gösteren switch case yapısı
        int day;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1 ila 7 arasında bir sayı giriniz: ");
        day = girdi.nextInt();

        switch (day){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }
    }
}
