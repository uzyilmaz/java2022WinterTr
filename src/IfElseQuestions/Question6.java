package IfElseQuestions;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int num1= scan1.nextInt();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2= scan2.nextInt();

        if (num1>0&&num2>0){
            System.out.println(num1+num2);
        }else if (num1<0&&num2<0){
            System.out.println(num1*num2);
        }else if (num1<0&&num2>0||num1>0&&num2<0){
            System.out.println("farkli isaretle sayilarla islem yapamazsin");
        }else if (num1==0||num2==0){
            System.out.println("sifir carpmada yutan elemandir");
        }


    }
}
