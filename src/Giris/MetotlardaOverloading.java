package Giris;

public class MetotlardaOverloading {
    static void show(int a, char b) {
        System.out.print("PATİKA PATİKA ");
    }

    static void show(char a, int b) {
        System.out.print("DEV DEV ");
    }

    static int info(int a) {
        System.out.println("Patika");
        return 0;
    }

    static void info(char a) {
        System.out.println("Dev");
    }

    public static void main(String[] args) {
        show(25, 'A');
        show('B', 11);
        info(5);
        info('a');

    }
}
