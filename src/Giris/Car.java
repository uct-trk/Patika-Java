package Giris;

public class Car {

    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    Car(String model, int speed, String color){
        // this class ı referans gösteriyor
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.speedLimit = 180;
    }

    void incSpeed(int increament){
        if(speed + increament <= speedLimit) {
            this.speed += increament;
        }
    }

    void decSpeed(int decreament){
        if(this.speed < 0) {
            this.speed -= decreament;
        }
    }

    void  printFeatures(){
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed);
    }
}
