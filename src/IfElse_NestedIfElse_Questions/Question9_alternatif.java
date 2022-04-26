package IfElse_NestedIfElse_Questions;

import java.util.Scanner;

public class Question9_alternatif {public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Lütfen bir yil giriniz");
    double yil = scan.nextDouble();
    if (yil>0) {
        if (yil % 4 != 0) {
            System.out.println("Girdiginiz yil artik yil degildir");
        } else if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println("Girdiginiz yil artik yildir");
        } else if (yil % 4 == 0 && yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Girdiginiz yil artik yildir");
        }else{
            System.out.println("Girdiginiz yil artik yil degildir");
        }
    } else {
        System.out.println("Lütfen gecerli bir deger giriniz");
    }
}
}

