package IfElse_NestedIfElse_Questions;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%5==0)
        {if (sayi%10==0){
            System.out.println("5e bolunen cift sayi");}else {
            System.out.println("5e bolunen tek sayi");}


        }
        if (sayi%5!=0){
            System.out.println("tekrar deneyin");}

    }
}
