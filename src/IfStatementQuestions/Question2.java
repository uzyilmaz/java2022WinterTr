package IfStatementQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ilk harfi giriniz");
        String ilkHarf=scan.next().toUpperCase();
        System.out.println(ilkHarf);
        String ilkHarfP="P";
        String ilkHarfC="C";
        String ilkHarfS="S";
        String gunP="Persembe, Pazartesi, Pazar";
        String gunS="Sali";
        String gunC="Carsamba, Cumartesi";
        if (ilkHarf.equals(ilkHarfC)) {
            System.out.println(gunC);
        }
        if (ilkHarf.equals(ilkHarfS)) {
            System.out.println(gunS);
        }
        if (ilkHarf.equals(ilkHarfP)) {
            System.out.println(gunP);
        }


    }
}
