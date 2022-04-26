package day22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch {

    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=9;

        //Eger javadan hazir method BinarySearch ile yapmak isterseniz
        //once sort methodunu kullanip sonra BinarySearch yapmaliyiz
        //binarySearch methodu bize istenen sayinin oldugu index i verir

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr, istenenSayi));// 2

        //Eger olmayan bir element i aratirsak
        //Java bulamadigini gostermek icin - isareti koyar
        //sonra da o sayi olsaydi siralamasi ne olacakti ise o sirayi bize verir




    }
}
