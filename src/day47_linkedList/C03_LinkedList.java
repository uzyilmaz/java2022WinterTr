package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();

        System.out.println(ll1.peek()); // bosken kullanilinca null dondurur
        //System.out.println(ll1.element()); // bosken bu methodu kullanirsak exception verir

        System.out.println(ll1.poll()); // bosken kullanilinca null dondurur

        System.out.println(ll1.pollFirst()); // bosken kullanilinca null dondurur

        //System.out.println(ll1.pop()); // ilk elementi silip bize dondurur.
                                        // ilk elementi bulamazsa (liste bossa) exception verir
        ll1.push(30); // listenin basina girilen element i ekler
        ll1.push(20);
        System.out.println(ll1); // [20, 30]

        System.out.println(ll1.remove()); // ilk elementi siler ve bize dondurur (20)
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50); // object olarak 50 yi siler
        ll1.push(30);
        System.out.println(ll1); // [30, 40, 30]
        ll1.removeFirstOccurrence(30);

        System.out.println(ll1); //[40, 30]



    }
}
