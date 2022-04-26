package TenaryExercices;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println((sayi<0)?((sayi*sayi)):"Sayi pozitif");
    }
}
