package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {
        List<Integer> sayilarListesi=new ArrayList<>();
        sayilarListesi.add(5); // [5]
        sayilarListesi.add(3); // [5, 3]
        sayilarListesi.add(0, 7); // [7, 5, 3]
        sayilarListesi.add(2, 7); // [7, 5, 7, 3]


        System.out.println(sayilarListesi.get(2)); // 7
        System.out.println(sayilarListesi); // [7, 5, 7, 3]
    }

}
