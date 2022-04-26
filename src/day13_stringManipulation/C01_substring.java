package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5)); //ile IT cok guzel
        //yukaridaki Stringi kullanarak Mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet hoca "+str.substring(5));
        System.out.println(str.substring(9));//yazilan index inclusive dir.

        //Eger bir index ten sona kadar olan parcayi degil belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir str.substring(baslangicIndexi, bitisIndexi)
        //baslangic indexi===>indclusive dir
        //bitis indexi===>exclusive dir.
        System.out.println(str.substring(0,5));//Java

        System.out.println(str.substring(0,1));
        //bana 6.harfi String olarak bulun
        String harf=str.substring(7,7);
        System.out.println(harf);

        //System.out.println(str.substring(5,2));//bitis index i baslangic index inden kucuk olamaz
        System.out.println(str.substring(str.length()-1));
        System.out.println(str.substring(str.length()-5));//son 5 harfi yazdirdik
        System.out.println(str.substring(str.length()));//son harften sonraki kismi yani hiclik verir
    }
}
