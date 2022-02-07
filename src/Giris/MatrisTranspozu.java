package Giris;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matris = {{2,3,4}, {5,6,4}};
        int[][] dublicate = new int[3][2];

        // orjinalde
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }

        // transpozu
        for (int i = 0; i < dublicate.length; i++) {
            for (int j = 0; j < dublicate[i].length; j++) {
                dublicate[i][j] = matris[j][i];
            }
        }

        for (int i = 0; i < dublicate.length; i++) {
            for (int j = 0; j < dublicate[i].length; j++) {
                System.out.print(dublicate[i][j]);
            }
            System.out.println();
        }

    }
}
