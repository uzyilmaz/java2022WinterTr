package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List <Integer> sayilar=new ArrayList<>();

        sayilar.add(5); // [5]
        sayilar.add(3); // [5, 3]
        sayilar.add(0, 7); // [7, 5, 3]
        sayilar.add(2, 7); // [7, 5, 7, 3]

        sayilar.remove(3); //index 3 teki element i siler
        //sayilar.remove(5); // hata verir IndexOutOfBoundsException

        //Sayilardan olusan bir list te objeyi vererek element silme methodu calismaz
        //Sayi degeri girdigimizde java otomatik olarak sayiyi index kabul eder.

        // int sayi=5;
        //sayilar.remove(sayi); //index olarak alir ve hata verir

        Integer sayi=5; //Integer Wrapper class i kullaninarak olusturulan 5 obje oldugu icin remove yontemiyle
                        //kullanildiginda list deki 5 i siler. Java bunu index olarak almaz
        sayilar.remove(sayi);

        System.out.println(sayilar); //[7, 7]
    }
}
