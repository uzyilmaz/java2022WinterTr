package IfStatementQuestions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //kullanicidan bir tamsayi isteyin
        //ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz: ");
        int sayi= scan.nextInt();
        sayi%=2;
        if (sayi==0) {
            System.out.println("girdiginiz sayi cift bir sayidir");
        }
        if (sayi==1) {
            System.out.println("girdiginiz sayi tek bir sayidir");
        }
    }

}
