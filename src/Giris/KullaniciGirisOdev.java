package Giris;

import java.util.Scanner;

public class KullaniciGirisOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String sifre, yeniSifre;

        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (sifre.equals("123")){
            System.out.println("Merhaba Hoşgeldiniz");
        } else {
            System.out.println("Hatalı giriş, şifrenizi sıfırlamak ister misiniz?:\n1-Evet\n2-Hayır ");
            select = input.nextInt();
            if (select == 1){
                System.out.print("Yeni şifreyi giriniz: ");
                yeniSifre = input.next();
                if (yeniSifre.equals("123")){
                    System.out.println("Yeni sifre oluşurulamadı");
                } else {
                    System.out.println("Yeni sifre hayırlı olsun");
                }

            } else {
                System.out.println("Cevabınız Hayır");
            }
        }
    }
}
