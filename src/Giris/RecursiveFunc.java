package Giris;

public class RecursiveFunc {

    static int basamaklarToplami(int sayi){
        System.out.println("sayı => " + sayi);
        if (sayi == 0){
            return 0;
        }else {
            System.out.println("Sayı: " + sayi);
            return sayi % 10 + basamaklarToplami(sayi / 10);
        }
    }

    static  int f(int n){
        System.out.println("n => " + n);
        if (n == 1){
            return 1;
        }
        int result = f(n - 1) + n;
        System.out.println("result => " + result);
        return result;
    }

    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }

    public static void main(String[] args) {
        System.out.println(f(3));

        System.out.println("Basamak toplami: "+basamaklarToplami(45612));

        System.out.println(as(3));

        recursiveMethod(4);
    }
}
