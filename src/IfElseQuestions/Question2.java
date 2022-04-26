package IfElseQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        String karakter= scan.next();
        String karakterListesi="a b c d e f g h i j k l m n o p r s t u v y z";

        if (karakterListesi.contains(karakter)){
            System.out.println("bu bir harftir");
        }else {
            System.out.println("bu bir harf degildir");
        }
    }
}
