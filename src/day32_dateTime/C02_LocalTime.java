package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm= LocalTime.now();
        System.out.println(tm); // 21:09:56.050010


        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden onceki zamani islemden sonraki zamandan cıkaririz (nano saniye kismini)
       int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println(tmLoopSonrasi); // 21:14:04.600504

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem "+ (nano2-nano1)+ " nano saniyede bitti");

        // ileri veya geriye gidebiliriz

        System.out.println(tm.plusMinutes(1000)); // 14:00:19.340690   1000 dk sonra saatin kac oldugunu gosterdi

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz


    }
}
