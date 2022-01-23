package Giris;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        int n1, n2, ekok, ebob, say;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayı: ");
        n1 = input.nextInt();;
        System.out.print("İkinci sayı: ");
        n2 = input.nextInt();

        ekok = (n1 > n2) ? n1 : n2;
        while(true)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                System.out.printf("Ekok: " + ekok);
                break;
            }
            ++ekok;
        }

        if(n1 > n2) {
            say = n1;
        } else {
            say = n2;
        }

        while(true)
        {
            if(n1 %say == 0 && n2 % say == 0) {
                ebob = say;
                break;
            }
            say--;
        }
        System.out.print("Ebob :" + ebob);
    }
}
