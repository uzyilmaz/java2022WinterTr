package day38_inheritance_overriding;

public class Ustabasi extends Isci{
    String statu="Ustabasi";
    String haklar="Ustabasi haftada 1 gun ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa ustabasi ekstra ucret almadan calisir");
    }
    public void maasHesapla(){
        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro= "+(30*8*12)+" euro maas alir");

    }

    public static void main(String[] args) {
        // Icinde oldugumuz class tan klasik haliyle bir obje olusturursak
        // o obje ile cagirdigimiz variable ve method larda Java once
        // icinde bulundugumuz class a bakar.
        // Aradigimiz class uyesi, icinde oldugumuz class ta varsa bize onu getirir
        // YOKSA, parent class lara bakar ve ilk buldugunu getirir.

        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu); // Ustabasi
        System.out.println(yasin.haklar); // Ustabasi haftada 1 gun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye); // Isciler yilda bir ikramiye alir
        System.out.println(yasin.izin); // Tum personel yilda 4 hafta izin hakkina sahiptir
        yasin.maasHesapla();
        yasin.mesai();

        // Eger isci olarak ozelliklerini gormek istersek
        // Class adini (Data Turu) Isci seceriz

        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu); // Isci
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye); // Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin); // Tum personel yilda 4 hafta izin hakkina sahiptir
        ahmet.maasHesapla();
        ahmet.mesai();


        // Siz bir objeyi hangi class tan tanimlarsaniz o class a ait ozelliklere sahip olur
        Personel adem=new Ustabasi();
        System.out.println(adem.statu); // Personel
        System.out.println(adem.haklar); // Tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye); // CTE
        System.out.println(adem.izin); // Tum personel yilda 4 hafta izin hakkina sahiptir
        adem.maasHesapla();
        adem.mesai();

        // Personel adem=new Ustabasi();  Bu bir Ustabasi objesidir
        // Personel adem=new Personel();  Bu bir Personel objesidir

        // Personel adem=new Ustabasi();
        // adem in data turu Personel dir.
        // boylece adem i ne olarak isimlendirdigimizi bilebiliriz
        // Ancak ben adem in Ustabasi oldugunu biliyorum cunku constructor i ustabasi
        // Ama bu yazim formati ile adem in tum Personel ile birlikte sahip oldugu ortak ozellikleri
        // vurgulamak istiyorum

        // Bu kullanim seklinde olusturulan obje data turu secilen class ve onun parent class larindaki
        // variable lari kullanabilir

    }
}
