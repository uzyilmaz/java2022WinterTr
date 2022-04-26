package day39_overriding;

public class OverridingChild extends OverridingParent{
    public  void method1(){
        System.out.println("child class method1 calisti");
    }

    public static void main(String[] args) {
        //Bir obje olusturulurken data turu ve constructor ayni class tan secilmisse
        // java direk o class a gider
        // hem variable hem de method icin
        // o class da varsa kullanir, yoksa o class in parentlerine bakar


       OverridingChild obj1=new OverridingChild();

       obj1.method1(); // child class method1 calisti
       obj1.method2(); // parent method2 calisti

        OverridingParent obj2=new OverridingChild();
        obj2.method2(); // parent method2 calisti
        obj2.method1(); // child class method1 calisti (java method1 in override yapildigini
                        // bildigi icin parent class taki override edilen yani etkisiz hale
                        // gelen method1 i kullanmaz child class takini kullanir


        // Eger data turu Parent, Constructor Child class dan secildiyse
        // variable larda yukaridaki sekilde calisma devam eder
        // Ancak methodlar icin data turunun oldugu class taki method
        // Child class tarafindan OVERRIDE  edilmis mi diye kontrol etmemiz gerekir
        // Eger child class larda bu method override edilmisse,
        // override eden method calisir.

        OverridingParent obj3=new OverridingParent();
        obj3.method2(); // Parent class method2 (cunku constructor i da OverridingParent)
        obj3.method1(); // Parent class method1

    }


}
