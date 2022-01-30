package MaasHesaplayici;

public class Hesaplama {
    Calisan w1;
    int minSalary = 1000;
    double newSalary = 0;
    double perHour = 30;
    int currentYear = 2022;
    double tax;
    int bonus;

    Hesaplama(Calisan w1){
        this.w1 = w1;
    }


    public void printInfo() {
        System.out.println("Adı: " + this.w1.name);
        System.out.println("Maaşı: " + this.w1.salary);
        System.out.println("Çalışma Saati: " + this.w1.workHours);
        System.out.println("Başlangıç Yılı: " + this.w1.hireYear);
        int howManyYears = this.currentYear - this.w1.hireYear;
        System.out.println(howManyYears + " Yıldır Aramızdasın :)");
    }

    public double checkTax(){
        if (this.w1.salary < this.minSalary && this.w1.salary >= 0){
            System.out.println("Vergi: " + this.tax);
            return this.tax;
        } else {
            this.tax = this.w1.salary * 0.03;
            System.out.println("Vergi: " + this.tax);
            return this.tax;
        }
    }

    public double isExtraWork(){
        int normalWorkHours = 40;
        if (this.w1.workHours > normalWorkHours){
            double extraHour = this.w1.workHours - normalWorkHours;
            double addMoney = extraHour * this.perHour;
            System.out.println("Mesai Ücreti: " + addMoney);
            return addMoney;
        } else {
            double extraHour = this.w1.workHours - normalWorkHours;
            double addMoney = extraHour * this.perHour;
            System.out.println("Mesai Ücreti: " + addMoney);
            return addMoney;
        }
    }

    public double raiseSalary(){
        double yearIncrease = 0;
        if(this.currentYear - this.w1.hireYear < 10 && this.currentYear - this.w1.hireYear >= 0){
            yearIncrease =  this.w1.salary * 0.05;
            System.out.println("Maaş Artışı: " + yearIncrease);
            return yearIncrease;
        } else if (this.currentYear - this.w1.hireYear > 9 && this.currentYear - this.w1.hireYear < 20){
            yearIncrease = this.w1.salary * 0.1;
            System.out.println("Maaş Artışı: " + yearIncrease);
            return yearIncrease;
        } else {
            yearIncrease = this.w1.salary * 0.15;
            System.out.println("Maaş Artışı: " + yearIncrease);
            return yearIncrease;
        }
    }
    public double vergiBonus(){
        double taxBonus = 0;
        taxBonus = this.w1.salary + isExtraWork() - checkTax();
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + taxBonus);
        return taxBonus;
    }
    public double totalSalary(){
        this.w1.salary =  vergiBonus() + raiseSalary();
        System.out.println("Toplam Maaş: " + this.w1.salary);
        return this.w1.salary;
    }
}
