package day22_Arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        //verilen array i buyukten kucuge siralayip bize donduren bir method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};

       arr=terstenSirala(arr);
        System.out.println(Arrays.toString(arr)); //[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
        System.out.println("en buyuk element: "+arr[0]);

    }

    public static int[] terstenSirala(int[] arr) {

        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];
        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.toString(tersArr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]=arr[arr.length-1-i];

        }
        return tersArr;
    }
}
