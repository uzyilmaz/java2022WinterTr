package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String, Integer> myMap=new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);

        // bir ekleme yapmak istedigimizde key daha once eklenmemisse map e eklesin
        // daha onceden eklenmisse, eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A", 6));

        if (myMap.putIfAbsent("K",20)!=null){
            System.out.println("Grdiginiz key map de zaten var");
        }
        System.out.println(myMap); // {A=6, H=3, K=5}

        myMap.put("A",10);
        System.out.println(myMap); // {A=10, H=3, K=5}

        myMap.computeIfAbsent("A",v->20);
        System.out.println(myMap); // {A=10, H=3, K=5}

        myMap.compute("A",(key,value)->20);
        System.out.println(myMap); // {A=20, H=3, K=5}

        // H nin degerini iki katinin 5 fazlasi yapalim

        myMap.compute("H",(k,v)->(2*v+5));
        System.out.println(myMap); // {A=20, H=11, K=5}



    }
}
