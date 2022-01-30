package Giris;

public class Diziler {

    static  void  printArray(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static int[] reverse(int[] list){
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length ; i++, j--){
            reverse[i] = list[j];
        }
        return reverse;
    }

    public  static  void prntArr(int[] list){
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {

        int[] list = new int[10];

     for (int i = 0; i < list.length; i++){
            list[i] = i * 10 + 10 ;
         System.out.println(list[i]);
     }


        int[] list2 = {10,20,30,40,50,60,70,80,90,100};


     for (int i = 0; i < list2.length; i++){
         System.out.println(list2[i]);
     }

     double[] list3 = {1.1,2.2,3.3,4.4};
     printArray(list3);


        int[] list5 = {10,20,30,40,50,60,70,80,90,100};
        int[] newList = reverse(list5);
        prntArr(newList);

    }
}
