package MayinTarlasi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int mayinSayisi = 0;
    int satir,sutun ;
    String[][] oyunHarita;
    int[][] alan;
    boolean oyunBittimi = false;

    MineSweeper(int satir, int sutun){
        this.satir = satir;
        this.sutun = sutun;
        this.alan = new int[satir][sutun];
        this.oyunHarita = new String[satir][sutun];
        oyunOynanis(satir,sutun);
    }

    public void oyunOynanis(int satir, int sutun){
        mayinSayisi = (satir * sutun) / 4;
        System.out.println("Mayın Sayısı: " + mayinSayisi);
        int sayi = 0;
        Random random = new Random();

        while (sayi < mayinSayisi){
            int mayinSatir = random.nextInt(satir);
            int mayinSutun = random.nextInt(sutun);

            if (this.alan[mayinSatir][mayinSutun] != 1){
                this.alan[mayinSatir][mayinSutun] = 1;
                sayi++;
            }
        }
        for (String[] strings : oyunHarita) {
            Arrays.fill(strings,"-");
        }
    }

    public void run(){
        oyunGoster();
        Scanner input = new Scanner(System.in);
        while (!oyunBittimi){
            haritaGoster();
            System.out.println("Satır giriniz");
            int row = input.nextInt();
            System.out.println("sutun giriniz");
            int col = input.nextInt();
            if (row > this.satir || row < 0) {
                System.out.println("Hatalı satır sayısı");
                continue;
            }
            if (col > this.sutun || col < 0){
                System.out.println("Hatalı sutun sayısı");
                continue;
            }
            select(row,col);
            if(isFinished()){
                System.out.println("Tebrikler oyunu kazandiniz.");
                break;
            }
            if(oyunBittimi){
                System.out.println("Mayina bastınız oyun bitti");
                haritaGoster();
            }
        }
    }


    private void haritaGoster(){
        System.out.println("------------");
        for(String[] i : this.oyunHarita){
            for(String j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    private void oyunGoster() {
        System.out.println("----- harita -------");
        for(int[] i : this.alan){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("----- harita -------");
    }

    public void select(int satir,int sutun){
        int sayi = 0;
        if(this.alan[satir][sutun] == 1) {
            this.oyunBittimi = true;
        }else {
            for(int i=satir-1; i<=satir+1; i++){
                for(int j=sutun-1; j<=sutun+1;j++){
                    if(i==satir && j==sutun)
                        continue;
                    try{
                        sayi+= alan[i][j];
                    }catch(Exception ignored){

                    }
                }
            }
            this.oyunHarita[satir][sutun] = String.valueOf(sayi);
        }
    }

    private boolean isFinished(){
        boolean isEmpty=true;
        for(int i= 0; i<oyunHarita.length;i++){
            for(int j=0; j<oyunHarita[i].length;j++){
                if (Objects.equals(oyunHarita[i][j], "-") && alan[i][j]==0 ) {
                    isEmpty = false;
                    break;
                }
            }
        }
        return isEmpty;
    }
}
