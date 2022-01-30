package BoxOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int firstPunch;

    Fighter(String name, int damage, int health, int weight, int dodge, int firstPunch){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
        if (firstPunch >= 0 && firstPunch <= 100){
            this.firstPunch = firstPunch;
        } else {
            this.firstPunch = 0;
        }
    }

    int hit(Fighter fighter){
        System.out.println(this.name + "=> " + fighter.name + " " + this.damage + " Hasar vurdu");
        if (fighter.isDodge()){
            System.out.println(fighter.name + " Gelen Hasarı blokladı");
            return fighter.health;
        }
        if (fighter.health - this.damage < 0){
            return 0;
        }
        return fighter.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean isFirst(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.firstPunch;
    }
}
