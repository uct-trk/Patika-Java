package OgrenciBilgiSistemi;

public class Teacher {

    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    void printInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefon numarası: " + this.phoneNumber);
        System.out.println("Bölümü: " + this.branch);
    }

}
