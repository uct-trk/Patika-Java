package Giris;

public class PolindromSayi {

    static boolean isPolindrom(int number){
        int temp = number, reverseNuber = 0, lastNumber;
        while (temp != 0){
            System.out.println("============");
            System.out.println("Sayı => " + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak => " + lastNumber);
            reverseNuber = (reverseNuber * 10) + lastNumber;
            System.out.println("Yeni Sayı => " + reverseNuber);
            temp = temp / 10;
            System.out.println("=============");
        }
        if (number == reverseNuber){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(101));
    }
}
