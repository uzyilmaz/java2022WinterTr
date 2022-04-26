package IfElseQuestions;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int num= scan.nextInt();

        if (num<50){
            System.out.println("Notunuzun harf karsiligi: "+"D");
        }else if (num>=50&&num<60){
            System.out.println("Notunuzun harf karsiligi: "+"C");
        }else if (num>=60&&num<80){
            System.out.println("Notunuzun harf karsiligi: "+"B");
        }else if (num>=80&&num<=100){
            System.out.println("Notunuzun harf karsiligi: "+"A");
        }
    }
}
