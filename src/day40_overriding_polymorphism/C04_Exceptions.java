package day40_overriding_polymorphism;

public class C04_Exceptions {
    public static void main(String[] args) {
        // String olarak verilen bir sayiyi int a cevirip
        // iki katini ekranda yazdiralim

        String str="12345a";

        // str icinde sayi olmayan bir karakter olursa
        // NumberFormatException.forInputString verir.


        try {
            int sayi= Integer.parseInt(str);
            System.out.println("girilen sayinin iki kati: "+2*sayi);
        }catch (Exception e){
            System.out.println("girdiginiz string sayi olmayan elementler iceriyor");
        }
    }
}
