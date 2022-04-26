package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); // [5, 7, 8, 6, 9]




        Iterator itr= liste.iterator();  // iterator methodunu olusturdugumuz liste
                                        // objesi uzerinden ArrayList class indan calistiriyoruz

        // iterator nasil calisir?
        // Bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
        // Iterator itr= liste.iterator();
        // yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde calismak
        // icin olusturmus olduk
        // Biz iterator objesini olusturdugumuzda iterator collection in ilkd elementinin
        // oncesine gidip bekler
        // [(itr) 5, 7, 8, 6, 9]
        // itr.hasNext()====> true  (listenin basinda bekleyen itr objesine yaninda
        //                    element varmi dedik evet dedi)
        // itr.next()===> iterator bir sonraki element in yanina gecer ve uzerinden gectigi
        //                elementi bize dondurur
        // [(itr) 5, 7, 8, 6, 9] ===> bize 5 dondurur
        // [5, (itr)7, 8, 6, 9] ===> bize 7 dondurur
        // itr.remove(); ==> iterator in son dondurdugu 8 i sildi.
        // itr.remove(); // IllegalStateException ===> ust uste iki kere remove yapinca bu
                        // bu hatayi verdi. cunku elindeki tek element i ilkd remove silmisti
                        // Dolayisiyla iki kere ust uste remove kullanilmaz. Tekrar next() methodunu
                        // calistirip iterator in eline yeni bir element vermeliyiz

        System.out.println(itr.hasNext()); // true
        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7
        System.out.println(itr.next()); // 8

        itr.remove();
        System.out.println(liste); // [5, 7, 6, 9]





    }
}
