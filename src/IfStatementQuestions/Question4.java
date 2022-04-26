package IfStatementQuestions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("lutfen ilk kenar uzunlugunu giriniz");
        int kenar1= scan1.nextInt();

        Scanner scan2=new Scanner(System.in);
        System.out.println("lutfen ikinci kenar uzunlugunu giriniz");
        int kenar2= scan2.nextInt();

        if (kenar1==kenar2){
            System.out.println("girdiginiz sekil karedir");
        }
        if (kenar1!=kenar2){
            System.out.println("girdiginiz sekil dikdortgendir");
        }

    }
}
