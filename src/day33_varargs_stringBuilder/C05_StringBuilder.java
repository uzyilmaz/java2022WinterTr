package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        // Compare iki stringBuilder i esit mi diye kontrol etmek icin
        // ilk harften baslayarak
        // tum karakterleri karsilastirir
        // ayni olan karakterler icin bir sey yazdirmaz
        // farkli olan ilk karakter icin ascii tablosuna gore kac deger geride
        // ya da ileri de oldugunu yazdirir.
        // Tamamen ayni ise bize 0 dondurur.
        // Bir sb ile bir String i compare edersek Java CTE verir

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2)); //0

        // stringBuilder da equals methodu Stringdeki == gibi calisir
        System.out.println(sb1.equals(sb2)); // false   farkli iki obje oldugu icin false verir
        System.out.println(sb1.equals(sb1)); // true    ancak obje kendisi ile karsilastirildiginda true verir

        System.out.println(sb1.equals(str)); // false

        // System.out.println(sb1==str); // farkli obje turleri oldugu icin java kıyas yapmaz




    }






}
