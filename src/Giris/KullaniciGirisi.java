package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("ugurcan") && password.equals("123")){
            System.out.println("Hoş geldiniz:" + userName + " Bey" );
        } else {
            System.out.println("Hatalı Giriş");
        }
    }
}
