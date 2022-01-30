package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacherInfo();
        } else {
            System.out.print("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void  printTeacherInfo(){
        this.teacher.printInfo();
    }
}
