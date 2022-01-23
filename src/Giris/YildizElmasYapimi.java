package Giris;

import java.util.Scanner;

public class YildizElmasYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Değer Giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for(int k = 1; k <= (n - i);k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int u = n-1 ; u >= 1 ; u--) { //Satır sayısı

            for (int h = 1; h <= (n-u) ; h++) { //Gereken boşluk sayısı
                System.out.print(" ");
            }
            for (int g = (2*u)-1; g>=1; g--) { //boşluk sonrası satırda kullanılacak yıldız sayısı
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
