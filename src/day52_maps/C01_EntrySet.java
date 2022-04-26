package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

       // myMap.entrySet() methodu bize entry lerden olusan bir set dondurur
        // eger bu entry leri manipule etmek istiyorsak
        // methodun dondurdugu seti yeni bir set olusturup store etmeliyiz

        Set<Map.Entry<Integer,String>> sinifEntrySeti=sinifListMap.entrySet();

        System.out.println("No    Isim    Soyisim    Brans");
        System.out.println("------------------------------");

        for (Map.Entry<Integer,String> each:sinifEntrySeti) {
            Integer entryKey=each.getKey();
            String valueStr=each.getValue();

            String valueArr[]=valueStr.split(", ");

            System.out.printf( "%-4d  %-6s  %-9s %-6s\n",entryKey,valueArr[0],valueArr[1],valueArr[2]);


        }
    }
}
