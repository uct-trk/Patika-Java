package Giris;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean isWin = false;
        int[] wrong = new int[5];
        boolean isWrong = false;

        while (right < 5){
            System.out.println("Lütfen sayı tahmininizi giriniz: ");
            selected = input.nextInt();
            if (selected < 0 || selected > 100){
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hata yaptınız kalan canınız: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yaparsanız canınız azalır");
                }
                continue;
            }
            if (selected == number){
                System.out.println("Tebrikler, doğru tahmin! " + number);
                System.out.println("Tahminleriniz = " + Arrays.toString(wrong));
                isWin = true;
                break;
            } else {
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı sayı girdiniz");
                if (selected > number){
                    System.out.println(selected + " gizli sayıdan büyüktür");
                } else {
                    System.out.println(selected + " gizli sayıdan küçüktür");
                }

                System.out.println("Kalan Hakkınız: " + (5 - right));
            }
        }
        if(!isWin){
            System.out.println("Kaybetiniz");
            System.out.println("Tahminleriniz = " + Arrays.toString(wrong));
            System.out.println("Tahmin edilmesi gereken sayı = " + number);
        }
    }
}
