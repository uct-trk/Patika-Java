package Giris;

import java.util.Arrays;
import java.util.Scanner;

public class YakinSayi {

    static  void yakinSayi(int[] array, int sayi){
        int[] siralanmisDizi = Arrays.copyOf(array, array.length);
        Arrays.sort(siralanmisDizi);
        System.out.println("Dizi: " + Arrays.toString(siralanmisDizi));

        if (sayi <= siralanmisDizi[0] || sayi >= siralanmisDizi[siralanmisDizi.length - 1]) {
            System.out.println("Girilecek sayı belirtilen sayılar arasında olmalıdır"
                    + siralanmisDizi[0] + " ve " + siralanmisDizi[siralanmisDizi.length - 1] + " (Bu iki değer hariç)");
        } else {
            int enKucuk = siralanmisDizi[0];
            int enBuyuk = siralanmisDizi[siralanmisDizi.length - 1];

            for (int i : siralanmisDizi) {
                if (i < sayi) {
                    enKucuk = i;
                }
            }

            for (int j = siralanmisDizi.length - 1; j >= 0; j--) {
                if (siralanmisDizi[j] > sayi) {
                    enBuyuk = siralanmisDizi[j];
                }
            }

            System.out.println("En Küçük Yakın " + enKucuk);
            System.out.println("En Buyuk Yakın " + enBuyuk);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int sayi = input.nextInt();
        int[] array = {15,12,788,1,-1,-778,2,0};
        yakinSayi(array, sayi);
    }
}
