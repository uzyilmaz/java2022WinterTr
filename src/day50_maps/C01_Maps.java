package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        // siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> sinifList=MapOlustur.myMap();
        System.out.println(sinifList);

        // Eger key lere tek tek ulasmak istersek
        // index yapisina ihtiyacimiz var
        // ancak map index yapisini desteklemez
        // bunun icin key leri once bir set e
        // sonra da set in tum elementlerini bir list e ekledik

        Set<Integer> sinifKeySeti=sinifList.keySet();
        List<Integer> keyList=new ArrayList<>();
        keyList.addAll(sinifKeySeti);
        System.out.println(keyList);
        System.out.println(keyList.get(1));

        // Simdi de value leri index ile ulasabilecegemiz bir sekle sokalim

        Collection <String> sinifValueColl=sinifList.values();
        System.out.println(sinifValueColl);
        System.out.println(sinifValueColl.size());

        List<String>sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList);

        // Herbir value birden fazla bilgiyi iceriyor
        // Onun icin value leri multidimensional bir array e
        // atmak mantikli duruyor
        // Ancak multidimensional array olusturmak icin boyutlari bilmeye
        // ihtiyacimiz var

        int outerArrayBoyut= sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // inner array lerin boyutunu bulmak biraz daha kompleks olacak
        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);

        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDArr[i][j]=temp[j];
            }

        }
        // Bu satira kadar key leri index ile ulasabildigim keyList e atadim.
        // value leri multidimensional array e atadim
        // Simdi bu key ve value leri istedigim gibi manipule edebilirim

        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("============================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+"     ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+"    ");

            }
            System.out.println();
        }
    }
}
