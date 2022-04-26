package IfStatementQuestions;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz");
        String dayName= scan.next();
        String dayHolyMus="CUMA";
        String dayHolyChris="PAZAR";
        String dayHolyJuif="CUMARTESI";

        if (dayName.equalsIgnoreCase(dayHolyMus)){
            System.out.println("Muslumanlar icin kutsal gun");
        }

        if (dayName.equalsIgnoreCase(dayHolyChris)){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (dayName.equalsIgnoreCase(dayHolyJuif)){
            System.out.println("Yahudiler icin kutsal gun");
        }

    }
}
