package day35_inheritance;

public class Child01 extends Parent{
    public static void main(String[] args) {
        // Child class hic bir obje ye ihtiyac duymadan
        // parent class taki variable ve method lara ulasabilir.

        System.out.println(isim); // Neval
        System.out.println(fabrika); // Yildiz Tekstil
        method1();
        method2();


    }
}
