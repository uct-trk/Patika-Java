package Giris;

public class Main {

    public static void main(String[] args) {

     Car audi = new Car();
     audi.model = "A8";
     audi.speed = 20;
     audi.incSpeed(30);
     audi.printFeatures();


     Car bmw = new Car();
     bmw.model = "X5";
     bmw.speed = 30;
     bmw.printFeatures();


     Car mercedes = new Car();
     mercedes.model = "CLA";
     mercedes.speed = 50;
     mercedes.printFeatures();

    }
}
