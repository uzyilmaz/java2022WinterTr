package day04_dataCasting_increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=20;

        System.out.println(sayi+10);//30
        //bu satirda sayiyi 10 artirmadim
        //sayinin 10 fazlasini yazdirdim

        System.out.println(sayi);//20
        //eger atama yapmazsak sayida yaptigimiz artırma ya da azaltma kalici olmaz

        sayi=sayi+10;

        System.out.println(sayi); //30

        System.out.println(sayi=sayi+=10);//40

        System.out.println(sayi);//40

        //bir variable in degerini kalici olarak artirmak veya azaltmak isterseniz
        //assignment sarttir.

        System.out.println(sayi++);
        System.out.println(sayi);

        System.out.println(++sayi);
        System.out.println(sayi);


    }
}
