package day05_MatematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data turu ile non-primitive arasindaki farklar nelerdir?

        String str="Java";
        int sayi=10;

        System.out.println(str.toUpperCase()); //JAVA
        System.out.println(str);

        //non-primitive data turleri data depolamak yanında bir çok faydalı metoda
        //sahiptir. Ancak primitive data turlerinin boyle bir ozelligi yoktur.
        //Primitive data turleri sadece degerleri saklarlar.(container)

        //primitive data turleri icin de bazı metodlar gerkli oldugunda
        // java ara bir cozum uretmistir.
        //java her bir primitive daata turunu non-primitive olarak kullanabilmek icin
        // ozel klaslar olusturmus ve bunlara Wrapper Class adını vermistir.

        double sayi2=20.5;

        //sayi2 primitive oldugundan sayi. dedigimizde hicbir metod gelmez

        Double sayi3=15.2;
        //sayi3 wrapper class olan Double classını kullandigindan
        //sayi3. dedigimizde bircok metod gelir.
    }
}
