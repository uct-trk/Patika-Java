package Giris;

public class CokBoyutluDiziler {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        int[][] list = {
                {4450, 234453, 123939, 5645243, 43653783, 6456891},
                {2130, 345453, 1765723939, 123243, 7436583, 65891},
                {7650, 765453, 45939, 2443, 423783, 68891},
                {340, 346453, 68939, 21233, 546783, 8765791},
                {0345, 899345453, 936789, 7567243, 123783, 86545691},
                {65470, 6757434, 93567549, 234243, 781233, 8221391},
        };
        System.out.println(list[3][3]);

        matrix[2][0] = 239;
        System.out.println(matrix[2][0]);


        int[][] matrix1 = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix1.length; x++) {
            int[] row = matrix1[x];

            for (int y = 0; y < row.length; y++) {
                row[y] = number;
                number++;
                System.out.println(row[y]);
            }
        }
            // yeni bir matris olusturalım


            int[][] matris = new int[3][4];
            int say = 1;
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[i].length; j++) {
                    matris[i][j] = say++;
                }
            }

            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[i].length; j++) {
                    System.out.print(matris[i][j] + " ");
                }
                System.out.println();
            }

        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < i + 1; ++j) {
            arr[i][j] = j + 1;
            }
        }
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < i + 1; ++j) {
            sum += arr[i][j];
            }
        }
        System.out.print(sum + "Toplam");




        }
    }
