package Giris;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, tr, tarih;
        double ort;

        System.out.print("Matematik: ");
        mat = input.nextInt();

        System.out.print("Fizik: ");
        fiz = input.nextInt();

        System.out.print("Kimya: ");
        kim = input.nextInt();

        System.out.print("Türkçe: ");
        tr = input.nextInt();

        System.out.print("Tarih: ");
        tarih = input.nextInt();

        ort = (mat + fiz + kim + tr + tarih) / 5;
        if (ort >= 50){
            System.out.println(ort + " Geçtiniz");
        } else {
            System.out.println(ort + " Kaldınız");
        }
    }
}
