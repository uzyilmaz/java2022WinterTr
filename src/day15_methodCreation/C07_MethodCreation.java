package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //string i yazdiran bir method olusturalim
        //hosgeldiniz diyen bir method olusturun
        //kapanma mesajı yazan bir method olusturalim

        hosgeldinYazdir();


    }

    private static void kapanmaMetodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMetodu();
    }
}
