package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //kullanicidan aldiginiz 4 basamakli bir sayinin rakamlar
        //toplamini bulunuz

        Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz: ");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        System.out.println(rakamlarToplami);

    }
}
