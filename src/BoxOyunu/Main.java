package BoxOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 10, 120, 90,0,50);
        Fighter f2 = new Fighter("Myke Tyson", 20, 85, 90,0,50);

        Match match = new Match(f1,f2,85,95);
        match.run();
    }
}
