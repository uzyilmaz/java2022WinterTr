package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayan bir method olusturalim

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaGel();
        toplaGel(sayi1);
        toplaGel(sayi1,sayi2,sayi3);
        toplaGel(sayi1,sayi2,sayi3,sayi4,sayi5);
    }

    private static void toplaGel(int... sayi) {
        int toplam=0;
        for (int each: sayi) {
            toplam+=each;
        }
        System.out.println(toplam);
    }



}
