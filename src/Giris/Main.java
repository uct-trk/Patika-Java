package Giris;

public class Main {

    public static void main(String[] args) {

     Car audi = new Car("A8", 20, "blue");
     audi.incSpeed(30);
     audi.printFeatures();


     Car bmw = new Car("X5", 50, "pink");
     bmw.printFeatures();
     System.out.println(bmw.color);


     Car mercedes = new Car("CLA", 80, "black");
     mercedes.printFeatures();

    }
}
