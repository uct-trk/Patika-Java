package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Calisan w1 = new Calisan("Ugurcan",2000,45,2000);

        Hesaplama hesaplama = new Hesaplama(w1);
        hesaplama.printInfo();
        hesaplama.totalSalary();

    }
}
