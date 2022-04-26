package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        //Soru: kullanicidan toplamak istedigi sayilari alin
        //ve kullanici 0 a basincaya kadar devam edin
        //kullanici sifira bastiginda girdigi tum sayilarin
        //toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=1000000; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();

            if (sayi==0){
                break;
            }else {
                toplam+=sayi;
            }
        }
        System.out.println(toplam);


        //aynı soruyu while ile yapalim

        sayi=1;
        toplam=0;
        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }System.out.println(toplam);
        //baslangic, bitis ve degisim degerleri net olan durumlarda degerleri net olan
        //durumlarda for loop daha avantajlıdır.
        //ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir.
    }
}
