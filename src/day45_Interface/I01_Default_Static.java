package day45_Interface;

public interface I01_Default_Static {

    // Interface lerde sadece abstract method lar bulunur
    // body si olan concrete olusturmak istediginizde java CTE verir.
    // Ancak java8 ve uzeri versiyonlarda istisnai olarak
    // static veya default olarak tanimlanan methodlar in
    // body si olabilir.
    // Ancak burada kullanilan default keyword u acces modifier degildir
    // Cunku interface lerde tum methodlar public ve abstract tir.

    // Asagidaki ornekte gorulecegi gibi default olarak tanimlanmis bir
    // method a acces modifier olarak public yazabilirsiniz.
    // (access modifier yazmasak da Java methodu public olarak kabul edecektir.

    void method1();

    public default void method2(){
        System.out.println("Interface deki default method");
    }
    static void method3(){
        System.out.println("Interface deki static method");
    }

}
