package day17_ForLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        //Soru: verilen iki harf ve aralarindaki harfleri yazdiran
        //bir kod yaziniz

        char ilkHarf='c';
        char sonHarf='s';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i+ " ");

        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;
        //baslangic ve bitis sayilari arasindaki artis miktari ile olusacad
        // butun sayilari yazdirin

        for (double i = 10; i <=20 ; i+=artis) {
            System.out.print(i+" ");

        }


    }
}
