package Giris;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        double perKm = 0.10, totalPrice = 0, distance = 0, childDiscount = 0.5, youngDiscount = 0.1, adultDiscount = 0.3, twoWayDiscount = 0.2;
        int age = 0, type;

        System.out.print("Yolculuk tipi seçiniz\n 1-)Gidis\n 2-)Gidiş-Dönüş\n Cevabınız: ");
        type = input.nextInt();

        switch (type){
            case 1:
                System.out.println("Gidiş");

                System.out.print("Kaç Yaşındasınız: ");
                age = input.nextInt();

                if (age > 0){
                    System.out.print("Kaç Km gideceksiniz: ");
                    distance = input.nextInt();

                    if (distance > 0){
                        if (age < 12 && age >= 0){
                            totalPrice = perKm * childDiscount * distance;

                        } else if (age >= 12 && age <= 24){
                            totalPrice = perKm * youngDiscount * distance;

                        } else if (age > 65){
                            totalPrice = perKm * adultDiscount * distance;

                        } else if (age >= 25 && age <= 65) {
                            totalPrice = perKm * distance;

                        } else {
                            System.out.println("Hatalı Yaş Seçimi Yaptınız!");
                        }
                    } else {
                        System.out.println("Mesafe Hatalı Girildi!");
                    }
                } else {
                    System.out.println("Hatalı Yaş!");
                }
                break;

            case 2:
                System.out.println("Gidiş Dönüş");

                System.out.print("Kaç Yaşındasınız: ");
                age = input.nextInt();

                if (age > 0){

                    System.out.print("Kaç Km gideceksiniz: ");
                    distance = input.nextInt();

                    if (distance > 0){

                        if (age < 12 && age >= 0){
                            totalPrice = perKm * youngDiscount * twoWayDiscount * (2 * distance);

                        } else if (age >= 12 && age <= 24){
                            totalPrice = perKm * youngDiscount * twoWayDiscount * (2 * distance);

                        } else if (age > 65){
                            totalPrice = perKm * adultDiscount * twoWayDiscount * (2 * distance);

                        } else if (age >= 25 && age <= 65) {
                            totalPrice = perKm * twoWayDiscount * (2 * distance);

                        } else {
                            System.out.println("Hatalı Yaş Seçimi!");
                        }
                    } else {
                        System.out.println("Hatalı Mesafe");
                    }
                } else {
                    System.out.println("Hatalı Seçim");
                }
                break;

            default:
                System.out.println("Hatalı Giriş");
        }

        System.out.println("Toplam Fiyat: " + totalPrice);
        System.out.println("Yaş: " + age);
    }
}
