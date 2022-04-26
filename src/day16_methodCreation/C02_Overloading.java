package day16_methodCreation;

public class C02_Overloading {
    public static void main(String[] args) {

        String str="Bu da gecer ya Huu";
        System.out.println(str.indexOf("d"));//3
        System.out.println(str.indexOf("a",5));//13
        System.out.println(str.indexOf('a',5));//13

         //bir class ta aynı isimde birden fazla method olmasina overloading denir
        //ayni classta birden fazla ayni isimli methodun çalismasi icin:
        // ya parametre sayisi farklı olmalı
        //veya parametre sayisi ayni ise argumentlerin data turleri farkli olmali

    }
}
