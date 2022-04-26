package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    //Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
//isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
//sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double num1= scan.nextDouble();
        double num2= scan.nextDouble();

        if (num1>0&&num2>0){
            System.out.println("girdiginiz iki sayi da pozitif oldugundan toplamaları: "
                    +(num1+num2));
        }else if (num1<0&&num2<0){
            System.out.println("girdiginiz iki sayi da negatif oldugundan carpimlari"
                    +(num1*num2));
        }else if (num1*num2<0){
            System.out.println("farkli isaretle sayilarla islem yapamazsin");
        }else {
            System.out.println("sifir carpmada yutan elemandir");
        }


    }
}
