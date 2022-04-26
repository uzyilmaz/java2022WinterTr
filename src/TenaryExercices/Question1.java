package TenaryExercices;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println((sayi1>sayi2)?sayi1:sayi2);

    }
}
