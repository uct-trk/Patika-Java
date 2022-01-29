package Giris;

public class Car {

    // Nitelikler

    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    void incSpeed(int increament){
        if(speed + increament <= speedLimit) {
            speed += increament;
        }
    }

    void decSpeed(int decreament){
        if(speed < 0) {
            speed -= decreament;
        }
    }

    void  printFeatures(){
        System.out.println("Model: " + model + " Hızınız: " + speed);
    }
}
