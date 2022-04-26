package day45_Interface;

public class C02_Default_Static_Method implements I01_Default_Static{

    // Bir interface de default ya da static olarak tanimlanan ve body si olan
    // methodlarin override edilmesi mecburi DEGILDIR
    // Eger static olarak tanimlanmissa zaten override edemeyiz.

    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    // Parent Interface deki default olarak tanimlanan method u istersek override ederiz ,
    // istersek etmeyiz. Override etmezsek


    //@Override
    //public void method2() {
     //   I01_Default_Static.super.method2();


    public static void main(String[] args) {
       // Interface de static olarak tanimlanan methodlara
        // static yontemlerle ulasilabilir: InterfaceIsim.methodIsmi

        I01_Default_Static.method3();

        C02_Default_Static_Method obj1=new C02_Default_Static_Method();
        obj1.method1(); // Child class
        obj1.method2(); // Parent Interface
        // obj1.method3();  eski class larda static bir uyeye static olmayan yollarla da
                          // ulasabilirdik. Ancak interface icerisinde static olarak
                        // tanimlanan method a static olmayan yontemlerle ulasilmaz

    }
}
