package TenaryExercices;

import java.util.Scanner;

public class NestedTernaryQuestion1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int y= scan.nextInt();
        System.out.println((y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y));
        //System.out.println((sayi<100)?(sayi<10?"Rakam":sayi<100):(sayi<100?"iki basamakli sayi":"uc basamakli ya da daha buyuk sayi"));
    }
}
