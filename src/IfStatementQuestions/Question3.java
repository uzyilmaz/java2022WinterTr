package IfStatementQuestions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir gun adi giriniz");
        String dayName=scan.next().toUpperCase();

        String dayWeek1="PAZARTESI";
        String dayWeek2="SALI";
        String dayWeek3="CARSAMBA";
        String dayWeek4="PERSEMBE";
        String dayWeek5="CUMA";
        String dayWeekEnd1="CUMARTESI";
        String dayWeekEnd2="PAZAR";

        if (dayName.equals(dayWeek1)) {
            System.out.println("haftaici");

        }
        if (dayName.equals(dayWeek2)) {
            System.out.println("haftaici");

        }
        if (dayName.equals(dayWeek3)) {
            System.out.println("haftaici");

        }
        if (dayName.equals(dayWeek4)) {
            System.out.println("haftaici");

        }
        if (dayName.equals(dayWeek5)) {
            System.out.println("haftaici");

        }
        if (dayName.equals(dayWeekEnd1)) {
            System.out.println("haftasonu");

        }
        if (dayName.equals(dayWeekEnd2)) {
            System.out.println("haftasonu");

        }
    }
}
