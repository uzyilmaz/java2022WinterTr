package day05_MatematikselIslemler;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi=10;
        //bu sayiyi 1 artirmak istersek
        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println(sayi);//12
        //eger 11 ve 12. satirda yaptigim iki islemi tek satirda yaparsam
        //java iki islemden önce hangisini yapacagini bilmek ister.
        //once artirir sonra yazdirirsak java yeni degeri yazdirir.
        //ama once yazdirir sonra artirirsak bu durumda eski deger yazdirilir.

        System.out.println("preincrement: "+ ++sayi); //once artir sonra yazdir :13
        System.out.println(sayi);//13

        System.out.println("postincrement satirinda" + sayi++);//once yazdir sonra artir:13

        System.out.println(sayi);//14





    }

}
