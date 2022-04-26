package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        // Soru: Kullanicidan yasini isteyin
        // kullanici yas olarak negatif bir sayi, 0 veya 120 den buyuk
        // bir sayi girerse IllegalArgumentException olusucak sekilde
        // bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz: ");
        int yas=scan.nextInt();

        if(yas<=0||yas>120){
            //System.out.println("lutfen gecerli bir yas giriniz");
            // Java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
        }else{
            System.out.println("uygun yas girdiniz");
        }
    }
}
