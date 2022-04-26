package day43_garbage_abstractClass;

public abstract class C04 {

    // Bir abstract class da abstract ya da concrete methodlar bulunabilir
    // Child class larin abstract methodlari override etmesi MECBURİ iken
    // concrete methodlarin override edilmesi OPSİYONEL dir.

    public abstract void absmethod();

    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        // Abstract class lar constructor a sahiptir
        // ancak abstract class lardan obje OLUSTURULAMAZ
        // Abstract class lar class lar OBJE BARINDIRMAYAN
        // sadece child class lar icin UYULMASI SART OLAN veya OPSİYONEL birakilan
        // ozellikleri tanimladigimiz bir depo class gibidir.

        // C04 obje=new C04();

        System.out.println("bu class abstract");

    }
}
