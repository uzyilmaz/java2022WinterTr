package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str="Java ogrenmek cok zevkli";

        //str nin ilk 4 harfini almak istesek
        str.substring(0,4);

        //Bir program yaparken daha kısa ve anlaşılabilir olmasi icin
        //surekli kullanabilecegimiz kod bloklarinı hazır olarak bir yere koyar
        //ihtiyacimiz oldukca oradan alir kullanırız

        //Method lar robotlara benzer
        //method olusturmak bazen o method un yapacagi isi yapmaktan zor olabilir
        //bir islemi sadece 1 kere yapacaksak method kullanmamıza gerek olmayabilir.
        //ancak ozellikle cok kullanacagimiz islemler için
        //her seferinde yeniden aynı kodları yazmak yerine
        // bu islemi yapan hazır bir method olusturmak cok daha pratiktir.

        //Bazen bir class ın icerisinde cok uzun kodlar yazarsak
        //tum class ın anlaşılması zorlasabilir.
        //Bunun yerine kod un belli kısımlarını ayrı methodlar olarak olusturup
        //main method icerisinden istediğimiz şekilde bu methodları yönetebiliriz.


    }
}
