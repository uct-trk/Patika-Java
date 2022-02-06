package Giris;

public class DiziOrtalamasi {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double avarege = 0.0;
        double sum = 0;
        for(int i = 0; i < list.length; i++){
            sum = sum + list[i];
        }
        avarege = sum / list.length;
        System.out.println("Eleman sayısı: " + list.length);
        System.out.println("Ortalama: " + avarege);
    }
}
