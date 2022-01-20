package Giris;

public class ContinueBreak {
    public static void main(String[] args) {
        /* for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        } */

        for (int i = 1; i <= 2; i++){
            System.out.println(i + "i");
            for (int j = 1; j < 4; j++){
                System.out.println(j + "j");
            }
        }

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }
    }
}
