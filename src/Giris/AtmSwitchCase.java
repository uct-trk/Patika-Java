package Giris;

import java.util.Scanner;

public class AtmSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kalanHak = 3, select, bakiye = 2000;
        String username, password;


        while (kalanHak > 0){
            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            if(username.equals("ugur") && password.equals("123")){
                System.out.println("Giriş Başarılı, Hoşgeldiniz");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int para = input.nextInt();
                            bakiye = bakiye + para;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            para = input.nextInt();
                            if (para > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye = bakiye - para;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);

                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere :)");
                break;
            } else {
                kalanHak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (kalanHak == 0){
                    System.out.println("Hesabınız Bloke Olmuştur Bankanız ile iletişime geçiniz");
                } else {
                    kalanHak--;
                    System.out.println("Giriş Başarısız, kalan hakkınız: " + kalanHak);
                }
            }
        }
    }
}
