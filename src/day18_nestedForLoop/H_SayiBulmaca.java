package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class H_SayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin


        Random rnd=new Random();

        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        System.out.println(sayi);


        Scanner scan = new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while (tahmin!=sayi){
            System.out.println("lutfen bir tahmin girin: ");
            tahmin=scan.nextInt();
            sayac++;

            if (tahmin>sayi){
                System.out.println("-kucult!");

            }else if (tahmin<sayi){
                System.out.println("-buyut!");

            }else {
                System.out.println("-🥳🥳🥳 Tebrikler "+sayac+" tahminde bildiniz");
            }
            if (sayac==3){
                System.out.println("!!!!! 3 sefer tahminde bulundun ama bilemedin. Sen bu kafayla Java da öğrenemezsin 😒");
            }
            }


    }
}
