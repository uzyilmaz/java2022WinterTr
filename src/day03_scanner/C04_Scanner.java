package day03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak için 3 adım takip edilir
        // 1. adım kendimize bir scanner oluşturmak

        Scanner scan=new Scanner(System.in); //esitligin saginda yeni bir scanner
                                            //ve olusturulan bu scanner scan variable na assign edilir
                                            //scan variable in ismidir istedigimiz ismi verebiliriz

        // kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin

        System.out.println("Lutfen isminizi giriniz");

        //3.adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        String kullaniciIsmi=scan.nextLine();

        System.out.println("Kullanicinin girdigi isim: "+kullaniciIsmi);

    }
}
