package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {

        //soru: kullanicidan istedigi kadar sayi girmesini isteyin
        //kullanicnin girdigi sayilarin toplami 500 gecerse
        //"artik yeter cok sayi girdin toplam ..."yazsin

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        while (toplam<500){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("artik yeter cok sayi girdin. Toplam: "+toplam+" oldu");
    }
}
