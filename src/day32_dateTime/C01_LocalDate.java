package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh=LocalDate.now(); //objenin olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh=LocalDate.of(1980, 02,12);
        //istedigimiz yil, ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh); // 2022-03-31
        //get li methodlarla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());// 31

        System.out.println(trh.getDayOfWeek());// THURSDAY

        System.out.println(trh.getMonthValue());// 3

        System.out.println(trh.getYear()); // 2022

        //bir tarihten istedigimiz kadar ileri veya geri gidebilirz
        System.out.println(trh.minusWeeks(20)); // 2021-11-11  20 hafta oncesi tarihi verdi
        System.out.println(trh.minusWeeks(5).minusDays(3)); //2022-02-21   5 hafta 3 gun onceki tarih
        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10   9 ay 10 gun sonrasi

        // Istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01   japonya da tarihi verdi

        // is ile baslayan method lar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); // false   bu yil artik olmadigi icin false verdi
        System.out.println(trh.isAfter(baskaTrh)); // true    verilen bir tarih digerinden sonrami diye bakar




    }
}
