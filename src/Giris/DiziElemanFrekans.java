package Giris;

import java.util.Arrays;

public class DiziElemanFrekans {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20,7,66,100,100,5,66,99,150,36,97,88,75,102,100,66,-50,-60,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
               if (arr[i] == arr[j]) {
                   count = count + 1;
               }
            }

            if (arr[i] != arr[i + 1]){
                System.out.println(arr[i] + " sayısı " + count + " kez tekrar etti");
            }
            count = 0;

        }
    }
}
