package day05_MatematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //verilen iki String teki sayıları toplayın.

        System.out.println(str1+str2);

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //35801

        //(Integer.valueOf(str1) metodu sadece sayisal deger iceren String lerde
        // kullanilabilir. bir tane bile sayi disinda karakter olursa java hata verir




    }
}
