package Giris;

public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        double[] list = {1,2,3,4,5};
        double avarage, sum = 0;

        for (int i = 0; i < list.length; i++){
            sum = sum + (1 / list[i]);
            System.out.println(1 / list[i]);
        }
        avarage = sum / list.length;
        System.out.println("Eleman sayısı: " + list.length);
        System.out.println("Ortalama: " + avarage);
    }
}
