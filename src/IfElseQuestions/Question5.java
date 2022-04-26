package IfElseQuestions;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String dayName= scan.next().toUpperCase();
        String dayNames="PAZARTESI"+ "SALI"+ "CARSAMBA"+"PERSEMBE"+ "CUMA"+ "CUMARTESI"+ "PAZAR";
        char firstletter= dayName.charAt(0);
        char secondletter= dayName.toLowerCase().charAt(1);
        char thirdletter=dayName.toLowerCase().charAt(2);

        if (dayNames.contains(dayName)){
            System.out.println(""+firstletter+secondletter+thirdletter);
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }


        }

    }

