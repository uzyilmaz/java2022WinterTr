package IfElse_NestedIfElse_Questions;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre= scan.next();


        if (sifre.contains("a"))
        {if (sifre.startsWith("A")){
            System.out.println("Gecerli Sifre");}else
        {
            System.out.println("Gecersiz sifre");}
        }

    }
}
