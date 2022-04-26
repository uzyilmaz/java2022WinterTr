package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1=new Cons01(); //default constructor devrede
        //Cons01 class inda hic cons olusturmazsak, Java default cons i kullandigindan
        // obj1 i uretebiliriz
        //Ancak biz parametreli veya parametresiz bir cons yazdigimzida java artik
        //default cons i siler.
        //Dolayisiyla biz herhangi bir cons olusturdugumuzda daha once baska
        //classlar veya kullanicilarin olusturmus olabilecegi objeleri kullanabilmeleri icin
        //default cons in islevini gerceklestirecek parametresiz bir cons olusturmakta fayda var

        Cons01 obj2=new Cons01("Java");

    }
}
