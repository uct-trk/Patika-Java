package Giris;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int ay, gun;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = input.nextInt();

        switch (ay){
            // ocak
            case 1:
                if (gun >= 1 && gun <=31){
                    if (gun < 23){
                        System.out.println("Oğlak");
                    } else {
                        System.out.println("Kova");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // şubat
            case 2:
                if (gun >= 1 && gun <=28){
                    if (gun < 20){
                        System.out.println("Kova");
                    } else {
                        System.out.println("Balık");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                // mart
            case 3:
                if (gun >= 1 && gun <=30){
                    if (gun < 20){
                        System.out.println("Balık");
                    } else {
                        System.out.println("Koç");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // nisan
            case 4:
                if (gun >= 1 && gun <=31){
                    if (gun < 21){
                        System.out.println("Koç");
                    } else {
                        System.out.println("Boğa");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // mayıs
            case 5:
                if (gun >= 1 && gun <=30){
                    if (gun < 22){
                        System.out.println("Boğa");
                    } else {
                        System.out.println("İkizler");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // haziran
            case 6:
                if (gun >= 1 && gun <=31){
                    if (gun < 23){
                        System.out.println("İkizler");
                    } else {
                        System.out.println("Yengeç");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // temmuz
            case 7:
                if (gun >= 1 && gun <=30){
                    if (gun < 23){
                        System.out.println("Yengeç");
                    } else {
                        System.out.println("Aslan");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // ağustos
            case 8:
                if (gun >= 1 && gun <=31){
                    if (gun < 23){
                        System.out.println("Aslan");
                    } else {
                        System.out.println("Başak");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // eylul
            case 9:
                if (gun >= 1 && gun <=30){
                    if (gun < 23){
                        System.out.println("Başak");
                    } else {
                        System.out.println("Terazi");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // ekim
            case 10:
                if (gun >= 1 && gun <=31){
                    if (gun < 23){
                        System.out.println("Terazi");
                    } else {
                        System.out.println("Akrep");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // kasım
            case 11:
                if (gun >= 1 && gun <=30){
                    if (gun < 22){
                        System.out.println("Akrep");
                    } else {
                        System.out.println("Yay");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
                // aralık
            case 12:
                if (gun >= 1 && gun <=31){
                    if (gun < 22){
                        System.out.println("Yay");
                    } else {
                        System.out.println("Oğlak");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz");
                }
                break;
            default:
                System.out.println("Hatalı ay girdiniz");
        }
    }
}
