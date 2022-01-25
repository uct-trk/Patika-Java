package Giris;

public class Metotlar {

    static int power (int base, int exp){
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result = result * base;
        }
        return result;
    }

    static int run(int x) {
        x = 10;
        return x;
    }

    public static void main(String[] args) {
        int a = power(2,3);
        System.out.println(a);

        int b = power(5,3);
        System.out.println(b);

        int x = 25;
        System.out.println(run(5));
    }
}
