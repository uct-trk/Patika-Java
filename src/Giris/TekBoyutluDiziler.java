package Giris;

public class TekBoyutluDiziler {
    public static void main(String[] args) {
        int cars[], count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++)
            System.out.print(cars[j] + ",");

        double list[] = new double[5];
        list[0] = 4.2;
        list[1] = 5.7;

        System.out.println(list.length);

        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
