package day20_scope_Arrays;


public class C02_StaticVariables {

    //instance variable lar obje ye bagimlidir ve her obje farklı degerler alabilir.
    //ogrenci notlari veya ogretmen branslari gibi diyebiliriz
    //bir objeye ait bir variable ın son degerini bulmak icin sadece o objeyi dikkate aliriz

    //Static variable lar ise class variable olarak tanımlanir
    //ve tum class uyeleri icin aynidir: Okul ismi, okul mudurunun adi gibi..
    //eger static variable in degeri degistirilirse herkes icin degisir.

    static String okulismi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {
        System.out.println(okulismi);//Yildiz Koleji
        System.out.println(okulNo); //0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false

        staticMethod();

        System.out.println(okulNo);


    }
    public static void staticMethod (){
        okulNo=200;
        System.out.println(okulNo);//200
    }

}
