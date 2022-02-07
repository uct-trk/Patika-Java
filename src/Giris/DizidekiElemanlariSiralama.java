package Giris;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        int count = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");

        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];

        if (arrLength >= 0) {
            System.out.println("Dizinin elemanlarını giriniz: ");
            for (int i = 0; i < arrLength; i++) {
                int eleman = input.nextInt();
                arr[i] = eleman;
                System.out.println(count++ + ". Elemanı: " + eleman);
            }
        } else {
            System.out.println("Diziler sıfırdan küçük olamaz");
        }


        System.out.println("Eleman sayısı: " + arr.length);
        Arrays.sort(arr);
        System.out.println("Sıralama: " + Arrays.toString(arr));
    }
}
