package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Mayın Tarlasına Hoş Geldiniz:");
        System.out.print("Satır Sayısı: ");
        row = scan.nextInt();
        System.out.println("Sütün Sayısı: ");
        col = scan.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,col);
        mineSweeper.run();
    }
}
