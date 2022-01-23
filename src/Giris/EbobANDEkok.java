package Giris;

import java.util.Scanner;

public class EbobANDEkok {
    public static void main(String[] args) {
        int x, y, ebob = 1, ekok = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        y = input.nextInt();

        for (int i = 1; i <= x; i++){
            if (x %i == 0 && y %i == 0){
                ebob = i;
            }
        }
        System.out.println("ebob: " + ebob);
        System.out.println("---------- alttaki daha az maliyetli ---------------");
        for (int k = x; k >= 1; k--){
            if (x %k == 0 && y %k == 0){
                ebob = k;
                break;
            }
        }
        // ekok = x * y / ebob; bu formülü kullanarak ekok bulunabilir
        for (int i = 1; i <= x * y; i++){
            if (i %x == 0 && i %y == 0){
                ekok = i;
                break;
            }
        }
        System.out.println("ebob: "  + ebob);
        System.out.println("ekok: "  + ekok);

    }
}
