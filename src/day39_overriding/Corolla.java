package day39_overriding;

public class Corolla extends Toyota{

    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";



    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }
    public void yakitTuketim(){
        System.out.println("Corolla 5,6 litre yakit tuketir");

    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        //Data turu ve constructor farkli oldugundan Constructor calistigi icin obje Constructor in
        // oldugu class ozelliklerini tasir.
        // Ancak data turu Parent secildigi icin variable lar data turunun secildigi class
        // ve onun parent class larindan deger alabilir.

        // Method lar icin ise yine data turunun oldugu class a gideriz
        // ancak direk method u calistirmadan once
        // method Override edilmis mi diye kontrol ederiz

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket); // Kendi class inda olmadigi icin Araba class indan alacak
        System.out.println(arb1.hiz); // Kendi class inda oldugu icin bu classtan alir
        System.out.println(arb1.yakit); // Kendi class inda oldugu icin bu classtan alir
        System.out.println(arb1.marka); // Kendi class inda olmadigi icin Toyota class indan alir
        System.out.println(arb1.sirketMerkezi); // Kendi class inda olmadigi icin Toyota class indan alir
        System.out.println(arb1.model); // Kendi class inda oldugu icin bu classtan alir
        arb1.motor(); // arb1 objesinin constructor i Corolla oldugu icin direk kendi class indan alir


        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket); // Kendi class inda olmadigi icin Araba class indan alacak
        System.out.println(arb2.hiz); // data turu Toyota secildigi icin Toyota classindan alir
        System.out.println(arb2.yakit); // Toyota classinda olmadigi icin Araba class indan alir
        System.out.println(arb2.marka); // Toyota class indan alir
        System.out.println(arb2.sirketMerkezi); // Toyota class indan alir
        //System.out.println(arb2.model); // Toyota classinda olmadigi icin Araba classina bakar orada da olmadigi icin CTE verir
        arb2.motor(); // Corolla
        arb2.garanti(); // Toyota
        arb2.yakitTuketim(); // Corolla
        // arb2.vitesSayisi();   Data turu olan Toyota dan baslayinca boyle bir method bulamadik. CTE

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket); // Data turu Araba oldugu icin direk Araba classina gider ve oradan alir
        System.out.println(arb3.hiz); // Data turu Araba oldugu icin direk Araba classina gider ve oradan alir
        System.out.println(arb3.yakit); // Data turu Araba oldugu icin direk Araba classina gider ve oradan alir
        System.out.println(arb3.marka); // Data turu Araba oldugu icin direk Araba classina gider ve oradan alir
        //System.out.println(arb3.sirketMerkezi); // Kendi class inda olmadigi icin ve daha yukarida class olmadigi icin CTE verir
        //System.out.println(arb3.model); //  Kendi class inda olmadigi icin ve daha yukarida class olmadigi icin CTE verir

        arb3.yakitTuketim(); // Corolla
        arb3.motor(); // Corolla
        //arb3.garanti(); // Aramaya Araba classindan basladi ve bu class ta olmadigi icin CTE
        //arb3.vitesSayisi(); // Aramaya Araba classindan basladi ve bu class ta olmadigi icin CTE
    }
}
