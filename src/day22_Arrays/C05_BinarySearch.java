package day22_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        //Verilen array de istenen bir elementin var olup olmadigini true/false yazdirarak
        //gosteren bir method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=1;

       istenenElemanVarmi(arr, istenenSayi);

       //Eger javadan hazir method BinarySearch ile yapmak isterseniz
        //once sort methodunu kullanip sonra BinarySearch yapmaliyiz
        Arrays.sort(arr);
        Arrays.binarySearch(arr, istenenSayi);



    }

    private static void istenenElemanVarmi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==istenenSayi){
                sonuc=true;

                break;
            }
            }
        System.out.println(sonuc);

        }
    }

