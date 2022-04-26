package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary deki iki sonucun data turleri farkli olabilir

        //verilen sayi 100 den buyukse sayi nin karesini alip yazdiran
        //100 den kucukse "sayi 100 den buyuk olmali" yazdiran
        //bir ternary olusturalim

        int sayi=150;

        //eger sonuclar farkli data turlerinde ise
        //atama yapacigimiz varaible in data turu tek olmasi gerektiginden
        //asagidaki gibi bir ternary de atama yapamayiz
        //ancak direk yazdirabiliriz
        System.out.println(sayi>100 ? sayi*sayi : "sayi 100 den buyuk olmali");

        int y=1; int z = 1;
        int a = y<10 ? y++ : z++; System.out.println(y + "" + z + "" + a);
    }
}
