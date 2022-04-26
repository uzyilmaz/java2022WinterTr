package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        // List ten gelene ozellikleri biliyoruz
        // onun icin Deque den gelen ozelliklere bakalim

        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10); // basa element ekler.
        ll1.addLast(20); // sona element ekler.  add() methoduna gore daha hızlıdır
        System.out.println(ll1); // [10, 20]
        System.out.println(ll1.element()); // 10   İlk elementi bize dondurur ama silmez
        System.out.println(ll1);

        System.out.println(ll1.getLast()); // 20    Son elementi bize dondurur ama silmez
        System.out.println(ll1.getFirst()); // 10    İlk elementi bize dondurur ama silmez

        ll1.offer(30); // sona ekler ama bize birsey dondurmez
        System.out.println(ll1);
        ll1.offerFirst(50);
        ll1.offerLast(40); // sona ekler ve bize true dondurur
        System.out.println(ll1); // [50, 10, 20, 30, 40]

        System.out.println(ll1.peek()); //50   İlke elementi dondurur ama silmez,  bulamazsa null dondurur

        ll1.poll();


    }
}
