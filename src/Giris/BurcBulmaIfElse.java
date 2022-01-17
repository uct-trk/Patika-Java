package Giris;

import java.util.Scanner;

public class BurcBulmaIfElse {
    public static void main(String[] args) {
        int ay, gun;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = input.nextInt();


        // ocak
        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Oğlak");
                } else {
                    System.out.println("Kova");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // şubat
        else if (ay == 2) {
            if (gun >= 1 && gun <= 28) {
                if (gun < 20) {
                    System.out.println("Kova");
                } else {
                    System.out.println("Balık");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // mart
        else if (ay == 3) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 20) {
                    System.out.println("Balık");
                } else {
                    System.out.println("Koç");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // nisan
        else if (ay == 4) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    System.out.println("Koç");
                } else {
                    System.out.println("Boğa");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // mayıs
        else if (ay == 5) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 22) {
                    System.out.println("Boğa");
                } else {
                    System.out.println("İkizler");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // haziran
        else if (ay == 6) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("İkizler");
                } else {
                    System.out.println("Yengeç");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // temmuz
        else if (ay == 7) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23) {
                    System.out.println("Yengeç");
                } else {
                    System.out.println("Aslan");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // ağustos
        else if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Aslan");
                } else {
                    System.out.println("Başak");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // eylul
        else if (ay == 9) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23) {
                    System.out.println("Başak");
                } else {
                    System.out.println("Terazi");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // ekim
        else if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Terazi");
                } else {
                    System.out.println("Akrep");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // kasım
        else if (ay == 11) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 22) {
                    System.out.println("Akrep");
                } else {
                    System.out.println("Yay");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        // aralık
        else if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    System.out.println("Yay");
                } else {
                    System.out.println("Oğlak");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz");
            }
        }
        else {
            System.out.println("Hatalı ay girdiniz");
        }
    }
}

