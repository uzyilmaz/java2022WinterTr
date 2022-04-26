package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        //istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str1.indexOf('J'));//0
        System.out.println(str1.indexOf("aska"));//10 ("aska"nin ilk karakterinin indeksini verir)
        //istersek bir harf ya da metin olarak verdigimiz String in index ini döndürür.
        System.out.println(str1.indexOf("l"));//19

        System.out.println(str1.length()-1);//19

        // Ayni harften birden fazla varsa
        System.out.println(str1.indexOf("b")); //5 (buldugu ilk "b"nin indeksini verir)


        System.out.println(str1.indexOf('b',5));
        //bu metodda java aramaya fromIndex yazdigimiz index ten baslar.
        //(inclusive)dir yani yazdigimiz index de dahildir.

        //verilen Stringteki ikinci 'a' harfinin indexini bulalim
        int ilkIndex=str1.indexOf('a'); //1
        System.out.println(str1.indexOf('a',ilkIndex+1));//ilkIndex in kendisi de dahil oldugu icin bir
                                                                        //bir sonrasina gecmek için ilkIndex in yanina + koyduk

        int ilkbIndex=str1.indexOf('b'); //1
        System.out.println(str1.indexOf('b',ilkbIndex+1));//9

        //20. index ten sonra "guzel" aratalim
        System.out.println(str1.indexOf("guzel",20));


        //String de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y"));// y yok demesi lazim ama return type i index yani sayi.
                                                //yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir.

        //kullanicidan mail adresini isteyin @ isareti icermiyorsa "gecersiz" yazdırın
        //iceriyorsa mail iniz kabul edildi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");
        String mail=scan.next();

        if (mail.indexOf("@")==(-1)){  //metinde olmayan karakter için -1 degeri verildigi icin
                                        //@ karakteri yoksa -1 verecegi icin bu yontemi kullandik
            System.out.println("Gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");
        }
    }
}
