package day43_garbage_abstractClass;

public class C01_Final {
    final static double piSayisi=3.14;
    final static String okulIsmi="Yildiz Koleji";

    public static void main(String[] args) {
        final int sayi=10;

       // okulIsmi="java koleji";    final olarak isaretlendigi icin degistirilemez



    }
    public static final void method1(){
        System.out.println("Parent class final method1");
    }
}
