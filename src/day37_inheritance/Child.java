package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    //bir class i child class yaptigimizda parent class taki constructor a
    // ulasmasi gerekir. Bu durumda parent class taki constructor in
    // access modifier i public ya da protected olmalidir. (ayni package da degilse)



    Child(){
        super();
        System.out.println("child class parametresiz constructor");
    }
    Child (int s){
        // Child class ta tum constructor larin ilk satirina
        // java nin yerlestirdigi constructor PARAMETRESIZ dir. yani super() seklindedir.
        System.out.println("child class parametreli constructor");
    }
    Child (int sayi1,int sayi2){
        // Eger parent class tan parametresiz constructor i degil de
        // baska bir constructor i calistirmak isterseniz bunu child class taki
        // constructor in ILK SATIRINA yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("child iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);
    }
}
