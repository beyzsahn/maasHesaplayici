package com.example.Java101.maasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax;
    void tax(){

        if(this.salary<1000 && this.salary>=0){
            tax=0;
        }else{
            tax=salary*3.0/100.0;
        }
        System.out.println("Vergi: "+tax);
    }
    double isBonus=0;
    void bonus(){

        if(this.workHours>40){
            isBonus=(workHours-40.0)*30.0;
        }
        System.out.println("Bonus: "+isBonus);
    }
    double raiseSalary;
    void raiseSalary(){
        int Year=2021;
        if(Year-hireYear<10){
            raiseSalary=this.salary*5.0/100.0;

        } else if (Year-hireYear>9 && Year-hireYear<20) {
            raiseSalary=this.salary*10.0/100.0;

        } else if (Year-hireYear>19) {
            raiseSalary=this.salary*15.0/100.0;

        }
        System.out.println("Maaş Artışı: "+raiseSalary);
    }
    public String toString() {
        System.out.println("===================");
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        this.tax();
        this.bonus();
        this.raiseSalary();
        System.out.println("Vergi ve Bonuslar ile bilrikte maaş: "+(salary+isBonus+tax));
        System.out.println("Toplam Maaş: "+(salary+isBonus+tax+raiseSalary));
        return null;
    }
}
