package Encapsulation;

public class Kitap {
    private int sayfaSayisi;
    private String kitapAdi, yazar;

    Kitap(int sayfaSayisi, String kitapAdi, String yazar) {
        if (sayfaSayisi < 1){
        this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
    }
    // sınıfa ait private değişkenler olduğu için sayfa sayımıza getter methodu ile erişiriz
    public  int getSayfaSayisi(){
        return  this.sayfaSayisi;
    }

    // getter ile sayfa sayısı değişkenine ulaştıktan sonra
    // setter ile sayfa sayımızı değiştirebilmek için setter metodu kullanılır
    public  void  setSayfaSayisi(int sayfaSayisi){
        if (sayfaSayisi < 1){
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }

    public void run(){
        System.out.println(this.kitapAdi);
        System.out.println(this.yazar);
        System.out.println(this.sayfaSayisi);
    }
}
