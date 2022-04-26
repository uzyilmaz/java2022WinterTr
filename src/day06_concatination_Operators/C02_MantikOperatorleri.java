package day06_concatination_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8; //true

        System.out.println(sonuc1);

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2);//false

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);//false

        int sayi3=15;
        System.out.println(sayi3<20 && sayi3>10); //true

        int sayi4=5;
        //sayi4 un 10 ile 20 in arasında olmadığını true diyerek dondurelim
        System.out.println(sayi4<10 || sayi4>20);


    }
}
