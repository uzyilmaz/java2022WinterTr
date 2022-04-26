package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        //Static variable lar direk class a baglidir.
        // Class icerisinde yapilan her turlu degisiklik statik variable lar da
        // kalici olur.
        // Instance variable lar ise obje ye baglidir.
        // Instance variable lara sadece obje uzerinden erisilebilir
        // ve bir obje uzerinden erisilirek yapilan degisiklik instance
        // variable nin degerrini tum objeler icin kalici olarak degistirmez
        // sadece o obje icin instance variable degerini kalici olarak degistirir

        System.out.println("sayi1: "+sayi1); //0
        //System.out.println("sayi2: "+sayi2);

        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2); //0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1: "+sayi1);
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1

        StaticKeyword obj2=new StaticKeyword();
        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1
        //static variable lar objeye bagli oldugu icin sayi1 daha once atanan
        //1 degerini yazdirir

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2);// 1
        System.out.println(obj2.sayi1);// 2

        System.out.println(obj1.sayi2);// 1
        System.out.println(obj1.sayi1);// 2

        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2);// 2
        System.out.println(obj1.sayi1);// 3

        System.out.println(obj2.sayi2);// 1
        System.out.println(obj2.sayi1);// 3





    }
}
