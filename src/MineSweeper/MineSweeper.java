package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber,colNumber,size;
    int[][] map;
    int[][] board;
    boolean game = true;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public  void run(){
        int row, col, success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyun Başladı ");
        while (game){
            print(board);
            System.out.print("Row: ");
            row = input.nextInt();
            System.out.print("Col: ");
            col = input.nextInt();
            if (row < 0 || row >= rowNumber){
                System.out.println("Geçersiz Koordinat");
                continue;
            }
            if (col < 0 || col >= colNumber){
                System.out.println("Geçersiz Koordinat");
                continue;
            }
            if(map[row][col] != -1){
                checkMine(row,col);
                success++;
                if(success == (size - (size/4))){
                    System.out.println("Oyunu Kazandınız");
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over");
            }
        }
    }

    public void checkMine(int row, int col){
        if (map[row][col] == 0){
            if ((col < colNumber - 1) && map[row][col + 1] == -1){
                board[row][col]++;
            }
            if ((row < rowNumber - 1) && map[row + 1][col] == -1){
                board[row][col]++;
            }
            if ((row > 0) && map[row - 1][col] == -1){
                board[row][col]++;
            }
            if ((col > 0) && map[row][col - 1] == -1){
                board[row][col]++;
            }
            if (board[row][col] == 0){
                board[row][col] = -2;
            }
        }
    }

    public void prepareGame(){
        int randRow,randCol, count = 0;
        while (count != (size/4)){
            randRow = random.nextInt(rowNumber);
            randCol = random.nextInt(colNumber);

            if (map[randRow][randCol] != -1){
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }
    public void print(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] >= 0)
                    System.out.print(" ");
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
