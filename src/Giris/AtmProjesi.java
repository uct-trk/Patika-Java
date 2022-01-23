package Giris;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        int kalanHak = 3 ,bakiye = 1500, select;
        Scanner input = new Scanner(System.in);

        while (kalanHak > 0){
            System.out.print("Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            if (userName.equals("ugur") && password.equals("123")){
                System.out.println("Giriş Başarılı, Hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma \n2-Para Çekme \n3-Bakiye Sorgulama \n4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.print("Yatırılacak para miktarı: ");
                        int para = input.nextInt();
                        bakiye = bakiye + para;
                    } else if (select == 2){
                        System.out.print("Çekilecek para miktarı: ");
                        int para = input.nextInt();
                        if (para <= bakiye){
                            bakiye = bakiye - para;
                        } else {
                            System.out.println();
                        }
                    } else if (select == 3){
                        System.out.println("Bakiyeniz: " + bakiye);
                    }
                }while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere :)");
                break;
            } else {
                kalanHak--;
                if (kalanHak == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                } else {
                    System.out.println("Hatalı Giriş kalan hakkınız: " + kalanHak);
                }
            }
        }
    }
}
