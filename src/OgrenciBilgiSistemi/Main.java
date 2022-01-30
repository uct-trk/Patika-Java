package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ugurcan", "123456789", "TRH");
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);


        Teacher t2 = new Teacher("Ayşe", "555444666", "FZK");
        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t2);


        Teacher t3 = new Teacher("Esra", "555446", "MAT");
        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.addTeacher(t3);



        Student s1 = new Student("İnek Şaban", "1", "4. sınıf", tarih, fizik, matematik);
        s1.addBulkExamNote(100,100,100);
        s1.addBulkSozluNote(100,100,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2", "4. sınıf", tarih, fizik, matematik);
        s1.addBulkExamNote(90,40,50);
        s1.addBulkSozluNote(50,60,70);
        s2.isPass();
    }
}
