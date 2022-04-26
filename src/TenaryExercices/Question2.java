package TenaryExercices;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi= scan.nextInt();
        System.out.println((sayi%2==0)?"Cift sayi":"Tek sayi");
    }
}
