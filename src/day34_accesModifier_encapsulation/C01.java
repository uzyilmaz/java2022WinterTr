package day34_accesModifier_encapsulation;

public class C01 {
    private static int sayi=10;
    private static String str="Java";
    static int acikSayi=20; // basina bir access modifier yazilmadigi icin
    // access modifier "default" olur

    String acikString="Hi"; // basina bir access modifier yazilmadigi icin
                            // access modifier "default" olur

    public static int halkaAcikSayi=15;
    protected static int aileyeOzel=40;

   protected C01(){
    // bu constructor in access modifier i default tur.
        //dolayisiyla pakacge i farkli olan bir classtan bu
        // constructor kullanilarak obje olusturulamaz.
    }

   private C01(int numara){
        System.out.println("parametreli constructor calisti");
    }
}
