package Giris;

public class TekrarEdenCiftDegerler {
    static  boolean isFind(int[] array, int value){
        for (int i : array){
            if (i  == value){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {

        int[] list = {2,2,7,7,69,48,70,7,36,48,36,10,75,82,10,11,11,6,6};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j]) && list[i] % 2 == 0){
                    if (!isFind(dublicate, list[i])){
                        dublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value: dublicate) {
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}
