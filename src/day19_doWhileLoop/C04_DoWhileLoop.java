package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
        // toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int negatifSayac=0;
        int pozitifSayac=0;

        do {
            System.out.println("lutfen pozitif bir tamsayi girin: \n Bitirmek için 0 a basin");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negatifSayac++;
            }else if (sayi>0){
                toplam+=sayi;
             pozitifSayac++;
            }
        }while (sayi!=0);
        System.out.println("girilen sayilarin toplami: "+toplam);
        System.out.println("Girdiginiz sayilarin "+negatifSayac+" adedi negatifdi.");
        System.out.println("Girdiginiz sayilarin "+pozitifSayac+" adedi pozitifdi.");
    }
}
