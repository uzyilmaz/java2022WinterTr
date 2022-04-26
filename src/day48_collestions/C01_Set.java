package day48_collestions;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // Soru : verilen bir arrayin tekrar eden elmentlerini sadece bir kere yazdiran
        // bir method olusturunuz

        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdir(arr);
    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementlerKumesi=new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElementlerKumesi.add(each);
        }
        System.out.println(tekrarsizElementlerKumesi);
    }
}
