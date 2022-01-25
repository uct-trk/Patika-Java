package Giris;

public class ReturnAndVoid {

    static int toplama(int x,int y){
        return x + y;
    }
    static void show()
    {
        System.out.println("Show metodu..");
        System.out.println(toplama(5,6));

    }

    static void sum(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        int sonuc = toplama(5,3);
        System.out.println("sonuc: " + sonuc);
        sum(5,20);
        show();

    }
}
