package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
        //kullanicidan bir tamsayi isteyin
        //ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi%2==0) {
            System.out.println("girdiginiz sayi cift bir sayidir");
        }
        if (sayi%2!=0) {
            System.out.println("girdiginiz sayi tek bir sayidir");
        }
        if (sayi%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("Girilen sayi tektir");
        }


    }

}

