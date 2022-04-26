package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //array i nasil deklare ederiz
        //data turu array in ismi ve koseli parantez yazarak array deklare edilir.
        int arr1[]={1, 3, 5};
        int[] arr2={2, 3, 5};
        int [] arr3={1, 4, 5};

        double arr4[]={10.2, 20.1,5};

        String arr5[]={"Ali", "Veli", "Ayse"};

        //assign mecburi midir?
        int sayi;
        int arr6[];
        //kullanmadan once mutlaka deger atamasi yapilmasi gerekir

        //hem deklare edip hem de atama yapmak istedigimde nasil yapabilirim?
        //1- Deklare edip esitligin sagina suslu parantez icerisinde degerleri yazabilirim (yukarida yaptik)
        //2- icine deger atamadan olusturmak isterseniz, boyutunu belirlememiz gerekir.(asagidaki gibi)

        int arr7[]=new int[5]; //java icinde 5 tane default deger olan bir array olusturur.
                                //[0,0,0,0,0] int icin default deger 0 dır

    }
}
