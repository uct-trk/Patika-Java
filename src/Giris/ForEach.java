package Giris;

public class ForEach {
    public static void main(String[] args) {


        int[] list = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i : list) {
            System.out.println(i);
        }


        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for(int m : u){
                System.out.print(m);
                }
            System.out.println();
        }
    }
}
