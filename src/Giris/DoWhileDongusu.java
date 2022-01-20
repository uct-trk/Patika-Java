package Giris;

import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {
        int x = 20;
        do {
          x++;
        } while (x < 20);
        System.out.println(x);

        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }

        int pass;
        Scanner girdi = new Scanner(System.in);
        boolean askPassword = true;

        do {
            System.out.print("Şifre Giriniz: ");
            pass = girdi.nextInt();
            if (pass == 123){
                askPassword = false;
            }
        } while (askPassword);
    }
}
