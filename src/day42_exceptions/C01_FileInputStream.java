package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Alti kirmizi cizili her kod CTE degildir.
        // Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer.
        // Bİz bugune kadar tamamina CTE diyorduk ancak
        // exception konusu ile birlikte
        // Compile Time Exception kavrami da hayatimiza girdi.

        //Exception lar icinde parent child iliskisi mevcuttur.
        // Eger bir kod icin birden fazla exception olusma ihtimali varsa
        // oncelikle olasi exception lar parent child iliskisi tasiyormu
        // bakmamiz gerekir
        // Eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz
        //Eger parent child iliskisi varsa sadece parent exception i yazabiliriz veya
        // ikisini de yazmak istersek
        // child i once parent i sonra yazmaliyiz.





    }
}
