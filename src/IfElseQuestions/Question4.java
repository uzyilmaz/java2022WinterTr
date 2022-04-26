package IfElseQuestions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen ilk kenari giriniz");
        int kenar1= scan1.nextInt();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Lutfen ikinci kenari giriniz");
        int kenar2= scan2.nextInt();

        Scanner scan3=new Scanner(System.in);
        System.out.println("Lutfen ucuncu kenari giriniz");
        int kenar3= scan3.nextInt();






        if ((kenar1+kenar2+kenar3)==kenar1*3){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar ucgen degil");
        }
    }
}
