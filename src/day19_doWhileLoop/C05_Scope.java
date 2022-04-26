package day19_doWhileLoop;

public class C05_Scope {
    //1- Bir method içerisinde oluşturulan variable lar sadece olusturuldukları
    //   method da kullanılabilirler. Baska methodlarda kullanılamazlar
    //2- Tum methodların kullanabilmesini istedigimiz variable lari
    //   class level da olustururuz.
    //   Class level da olusturduğumu variable ı static yaparsak tum methodlar kullanabilir
    //   static olmazsa (instance) o zaman sadece static olmayan methodlar kullanabilir
    //3- Loop icerisinde olusturulan variable lar loop icerisinde kullanılabılır
    //   ama loop un dısında kullanılamaz

    static String kurs="Java";
    int level=10;
    static int sayi4;

    public static void main(String[] args) {

        int sayi=10;
        //isim="Veli Yan";
        System.out.println(kurs); //static variable ı burada kullanabiliyorum
        //System.out.println(level);//bu variable static tanımlanmadığı için kullanamadim

        for (int i = 0; i < 0; i++) {
            System.out.println(i);
            int loopSayi=20;


        }
        //System.out.println(i);
        //loopSayi=30;

        int sayi2;

        sayi4++; // class seviyesinde olusturup deger atamadigim sayi4 u artırmama java itiraz etmiyor

    }
    //sayi2++; //ama main method icinde olusturup deger atamadigim sayiyi artirmama java itiraz ediyor

    public static void method1(){
        //sayi=20;
        String isim="Ali Can";
        System.out.println(kurs); //static variable ı burada kullanabiliyorum
        //System.out.println(level);//bu variable static tanımlanmadığı için kullanamadim
    }
    public void method2 (){
        //sayi=30;
        //isim="Ayse San";
        System.out.println(kurs); //static variable ı burada kullanabiliyorum
        System.out.println(level);//bu method static olmadigi icin burada hata vermedi.
    }
}
