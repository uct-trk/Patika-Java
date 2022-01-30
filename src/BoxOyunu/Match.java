package BoxOyunu;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public  void run(){
        if (isCheck()){

               if (f1.isFirst()){
                   while (this.f1.health > 0 && this.f2.health > 0) {
                       this.f2.health = this.f1.hit(this.f2);
                       System.out.println("Myke Kalan Can: " + this.f2.health);
                       if (isWin()) {
                           break;
                       }
                       this.f1.health = this.f2.hit(this.f1);
                       System.out.println("Muhammed Ali Kalan Can: " + this.f1.health);
                       if (isWin()) {
                           break;
                       }
                   }
               }
               if (f2.isFirst()){
                while (this.f1.health > 0 && this.f2.health > 0){
                   this.f1.health = this.f2.hit(this.f1);
                   System.out.println("Muhammed Ali Kalan Can: " + this.f1.health);
                   if (isWin()){
                       break;
                   }
                   this.f2.health = this.f1.hit(this.f2);
                   System.out.println("Myke Kalan Can: " + this.f2.health);
                   if (isWin()){
                       break;
                   }
               }

           }
        } else {
            System.out.println("Sporcuların sikletleri uyuşmuyor");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
             System.out.println("Kazanan: " + this.f2.name);
             return true;
        }
        if(this.f2.health == 0) {
             System.out.println("Kazanan: " + this.f1.name);
             return true;
        }
        return false;
    }

}
