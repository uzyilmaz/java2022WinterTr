package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","Veli","Ayse"};
        //Array icindeki elementlere ulasabilmek icin index kullanırız

        System.out.println(arr1[0]); //Ali

        arr1[1]="Esila";

        System.out.println(arr1[1]);//Esila

        //arrayin icindeki indexi kullanarak elemenlere ulasabilir ve update edebiliriz

        int arr2[]=new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        //System.out.println(arr2[5]);//hata verir cunku array de 4 nesne var

        //Array in tamamini yazdirmak istersek:

        System.out.println(arr2); //[I@7dc36524
                                    //array ler non-primitive olduklarından direk yazdirmak istersek
                                    //java referans bilgisini yazdirir

        for (int i = 0; i <4; i++) {
            System.out.print(arr2[i]+" ");

        }
        System.out.println("");

        //array i yazdirmak icin javadaki arrays class indan toString methodu kullaniriz

        System.out.println(Arrays.toString(arr2));// [0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=22;

        System.out.println(Arrays.toString(arr2));// [0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1)); // [Ali, Esila, Ayse]



    }
}
