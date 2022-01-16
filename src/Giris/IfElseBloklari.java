package Giris;

public class IfElseBloklari {
    public static void main(String[] args) {
        int a = 10, b = 10;
        boolean compare = a == b;

        if (compare){
            a = 50;
            System.out.println("a sayısı: " + a);
            System.out.println("Eşittir");
        } else {
            System.out.print("Eşit değildir");
        }

        int x = 3, y = 2, z = 4;
        if (x < y && x < z){
            System.out.println("en küçük sayı x: " + x);
        } else if (y < x && y < z){
            System.out.println("en küçük sayı y: " + y);
        } else {
            System.out.println("En küçük sayı z: " + z);
        }

        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);

        int u = 20, s = 10;
        if ((u < s) && (s++ < 25)){
            System.out.println(u);
        }else{
            System.out.print(u);
        }
        System.out.println(s);
    }
}
