package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        // LinkedList in 2 tane parent interface i vardir
        // LinkedList olustururken data turu olarak;
        // LinkedList secersek: İki parent daki tum methodlar kullanilabilir,
        // List secersek: sadece List interface indeki methodlar
        // Deque/Queue secersek: Deque deki methodlari kullanabiriz

        LinkedList <Integer> ll1=new LinkedList<>();
        ll1.add(10); // LinkedList interface den bu methodu alir


        // Sadece List interface inden ozellikler kullanmak istersek:

        List<Integer> ll2=new LinkedList<>();

        ll2.add(10);
        ll2.remove(0);

        // Sadece Deque den gelen ozellikleri kullanmak istersek:

        Deque<Integer> ll3=new LinkedList<>();

        ll3.addLast(20);
        ll3.addFirst(15);

        System.out.println(ll3); // [15, 20]

        ll3.addLast(40); // [15, 20, 40]




    }
}
